package message.entity;

import java.util.List;

/**
 * 交易Entity
 *
 * @author Wang yong
 * @date 2016/1/11
 */
public class BaichuanTrade {
    //商品列表
    private List<AuctionInfo> auction_infos;
    //买家混淆id
    private String buyer_id;
    //扩展字段
    private Extern extre;
    //电子凭证类订单标示
    private boolean is_eticket;
    //order_status
    private String paid_fee;
    //主订单id
    private String order_id;
    //订单状态
    private String order_status;

    public List<AuctionInfo> getAuction_infos() {
        return auction_infos;
    }

    public void setAuction_infos(List<AuctionInfo> auction_infos) {
        this.auction_infos = auction_infos;
    }

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public Extern getExtre() {
        return extre;
    }

    public void setExtre(Extern extre) {
        this.extre = extre;
    }

    public boolean is_eticket() {
        return is_eticket;
    }

    public void setIs_eticket(boolean is_eticket) {
        this.is_eticket = is_eticket;
    }

    public String getPaid_fee() {
        return paid_fee;
    }

    public void setPaid_fee(String paid_fee) {
        this.paid_fee = paid_fee;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
}



