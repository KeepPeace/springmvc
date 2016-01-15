package reflect;

import com.alibaba.fastjson.JSON;
import message.receiver.processor.BaichuanTradeProcessor;
import org.junit.Test;

/**
 * ReflectTest
 *
 * @author Wang yong
 * @date 2016/1/14
 */
public class ReflectTest {

    @Test
    public void reflect(){
        Class clz = null;
        try {
            clz = Class.forName("message.entity.BaichuanTrade");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String json = "{\"buyer_id\":\"AAFDg3trABpL86adzOb7GpFt\",\"extre\":{\"user_id\":\"1\"},\"paid_fee\":\"1333332.00\",\"order_id\":\"887450175256640\",\"order_status\":\"7\",\"auction_infos\":[{\"detail_order_id\":\"887450175256640\",\"auction_id\":\"AAFAg3toABpL86adzO6Hh49u\",\"auction_pict_url\":\"i1/263660307/TB2dM.OapXXXXaoXXXXXXXXXXXX_!!263660307.jpg\",\"auction_title\":\"自动化测试宝贝不要改不要买\",\"auction_amount\":\"2\"}]}";
        Object obj = JSON.parseObject(json, clz);
        new BaichuanTradeProcessor().process(obj);
    }
}
