package message.receiver.processor;

import message.entity.BaichuanTrade;
import org.springframework.stereotype.Component;
import util.LogUtil;

/**
 * BaichuanTradeProcessor
 *
 * @author Wang yong
 * @date 2016/1/14
 */
@Component("baichuanTradeProcessor")
public class BaichuanTradeProcessor implements MessageProcessor {

    public boolean process(Object entity) {
        BaichuanTrade trade = (BaichuanTrade)entity;
        LogUtil.info(trade.getOrder_id());
        return false;
    }
}
