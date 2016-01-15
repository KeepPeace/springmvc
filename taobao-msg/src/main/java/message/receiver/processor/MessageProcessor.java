package message.receiver.processor;

/**
 * Created by Administrator on 2016/1/14.
 */
public interface MessageProcessor {

    public boolean process(Object entity);
}
