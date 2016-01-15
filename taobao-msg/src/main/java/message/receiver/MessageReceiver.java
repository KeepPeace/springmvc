package message.receiver;

import com.taobao.api.internal.tmc.TmcClient;
import org.springframework.beans.factory.annotation.Autowired;
import util.LogUtil;

/**
 * MessageReceiver
 *
 * @author Wang yong
 * @date 2016/1/14
 */
public class MessageReceiver {
    @Autowired
    private MessageProcessHandler messageProcessHandler;

    public void doReceive() throws Exception{
        String app_key = "";
        String app_secret = "";

        TmcClient client = new TmcClient(app_key,app_secret,"default");
        client.setMessageHandler(messageProcessHandler);
        client.connect();
        LogUtil.info(client.isOnline());
    }
}
