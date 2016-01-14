package json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import message.entity.AuctionInfo;
import message.entity.BaichuanTrade;
import message.entity.Extern;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * FastJsonTest
 *
 * @author Wang yong
 * @date 2016/1/11
 */
public class FastJsonTest {

    @Test
    public void parseObject(){
        String json = "{\"buyer_id\":\"AAFDg3trABpL86adzOb7GpFt\",\"extre\":{\"user_id\":\"1\"},\"paid_fee\":\"1333332.00\",\"order_id\":\"887450175256640\",\"order_status\":\"7\",\"auction_infos\":[{\"detail_order_id\":\"887450175256640\",\"auction_id\":\"AAFAg3toABpL86adzO6Hh49u\",\"auction_pict_url\":\"i1/263660307/TB2dM.OapXXXXaoXXXXXXXXXXXX_!!263660307.jpg\",\"auction_title\":\"自动化测试宝贝不要改不要买\",\"auction_amount\":\"2\"}]}";
        BaichuanTrade createOrder = JSON.parseObject(json, BaichuanTrade.class);
        List<AuctionInfo> action_infos = createOrder.getAuction_infos();
        for(int i=0;i<action_infos.size();i++){
            AuctionInfo info = (AuctionInfo)action_infos.get(i);
            System.out.println(info.getAuction_title());
        }
        System.out.println(createOrder.getExtre().getUser_id());
        System.out.println(createOrder.getExtre().getUser_name());
    }

    @Test
    public void toJsonString(){
        BaichuanTrade createOrder = new BaichuanTrade();
        createOrder.setBuyer_id("buyer_id");
        createOrder.setOrder_id("order_id");
        Extern extre = new Extern();
        extre.setUser_id(123);
        createOrder.setExtre(extre);
        List<AuctionInfo> list = new ArrayList<AuctionInfo>();
        for(int i=0;i<3;i++){
            AuctionInfo info = new AuctionInfo();
            info.setAuction_id("auction_id_"+i);
            list.add(info);
        }
        createOrder.setAuction_infos(list);
        //数组
        List<BaichuanTrade> orderList = new ArrayList<BaichuanTrade>();
        orderList.add(createOrder);
        orderList.add(createOrder);
        //循环引用
        System.out.println("1.----------------------------");
        System.out.println(JSON.toJSONString(orderList));
        System.out.println("2.-------DisableCircularReferenceDetect---------------------");
        System.out.println(JSON.toJSONString(orderList, SerializerFeature.DisableCircularReferenceDetect));
    }
}
