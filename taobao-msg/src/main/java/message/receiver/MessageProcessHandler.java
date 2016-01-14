package message.receiver;

import com.alibaba.fastjson.JSON;
import com.taobao.api.internal.tmc.Message;
import com.taobao.api.internal.tmc.MessageHandler;
import com.taobao.api.internal.tmc.MessageStatus;
import message.entity.ShortMessage;

import java.util.HashMap;

public class MessageProcessHandler implements MessageHandler {
    private static HashMap<String,Integer> topicMap;
    private String content;
    private String topic;
    private int topicType;

	public void onMessage(Message message, MessageStatus status) {
        try {
            content = message.getContent();
            topic = message.getTopic();
            System.out.println("topic:" + topic);

            switch (getTopicType(topic)) {
                case 1:
                    break;
                default:
                    break;
            }
            ShortMessage shortMessage = JSON.parseObject(content, ShortMessage.class);
            System.out.println(shortMessage.getMobile());
        } catch (Exception e) {
            e.printStackTrace();
            status.fail();  // 消息处理失败回滚，服务端需要重发
        }
    }

    private int getTopicType(String topicName){
        return topicMap.get(topicName);
    }
}
