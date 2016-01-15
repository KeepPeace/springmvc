package message.receiver.processor;

import message.entity.ShortMessage;
import org.springframework.stereotype.Component;
import util.LogUtil;

/**
 * ShortMessageProcessor
 *
 * @author Wang yong
 * @date 2016/1/14
 */
@Component("shortMessageProcessor")
public class ShortMessageProcessor implements MessageProcessor {
    public boolean process(Object entity) {
        ShortMessage message = (ShortMessage)entity;
        LogUtil.info(message.getMobile());
        return false;
    }
}
