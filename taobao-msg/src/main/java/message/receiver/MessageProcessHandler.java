package message.receiver;

import com.alibaba.fastjson.JSON;
import com.taobao.api.internal.tmc.Message;
import com.taobao.api.internal.tmc.MessageHandler;
import com.taobao.api.internal.tmc.MessageStatus;
import message.receiver.processor.MessageProcessor;
import org.springframework.stereotype.Component;
import util.LogUtil;
import util.WebContextUtil;

import javax.annotation.Resource;
import java.util.HashMap;

@Component("messageProcessHandler")
public class MessageProcessHandler implements MessageHandler {
    @Resource
    private HashMap<String,String> topicProps;
    private MessageProcessor messageProcessor;

	public void onMessage(Message message, MessageStatus status) {
        String content;
        String topic;
        String entityName;
        String processorName;
        try {
            content = message.getContent();
            LogUtil.info("content:" + content);
            topic = message.getTopic();
            LogUtil.info("topic:" + topic);
//            content = "{\"buyer_id\":\"AAFDg3trABpL86adzOb7GpFt\",\"extre\":{\"user_id\":\"1\"},\"paid_fee\":\"1333332.00\",\"order_id\":\"887450175256640\",\"order_status\":\"7\",\"auction_infos\":[{\"detail_order_id\":\"887450175256640\",\"auction_id\":\"AAFAg3toABpL86adzO6Hh49u\",\"auction_pict_url\":\"i1/263660307/TB2dM.OapXXXXaoXXXXXXXXXXXX_!!263660307.jpg\",\"auction_title\":\"自动化测试宝贝不要改不要买\",\"auction_amount\":\"2\"}]}";
//            topic = "taobao_tae_BaichuanTradeCreated";
            String[] array = getEntityNmae(topic);
            entityName = array[0];
            processorName = array[1];

            Class clz = null;
            clz = Class.forName(entityName);
            Object obj = JSON.parseObject(content, clz);
            messageProcessor = (MessageProcessor)WebContextUtil.getContext().getBean(processorName);
            boolean st = messageProcessor.process(obj);
            if (!st){
                status.fail();
            }
        } catch (Exception e) {
            e.printStackTrace();
            status.fail();  // 消息处理失败回滚，服务端需要重发
        }
    }

    private String[] getEntityNmae(String topic){
        return topicProps.get(topic).split(",");
    }

}
