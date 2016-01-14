package message.receiver;

import com.taobao.api.internal.tmc.TmcClient;
import com.taobao.top.link.LinkException;

/**
 * Created by Administrator on 2016/1/11.
 */
public class MsgReceiver {
	public static void main(String[] args) throws InterruptedException, LinkException{
		String app_key = "23262251";
		String app_secret = "c28580a85530745245950aaddb0cd9bf";

	    TmcClient client=new TmcClient(app_key,app_secret,"default");
	    client.setMessageHandler(new MessageProcessHandler());
		client.connect();
	    System.out.println(client.isOnline());
	    Thread.sleep(64000000L);
	}
}



