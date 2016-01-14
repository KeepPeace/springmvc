package message.entity;

/**
 * 退款Entity
 *
 * @author Wang yong
 * @date 2016/1/13
 */
public class BaichuanTradeRefund {
    private String buyer_id;
    private String extre;
    private String oid;
    private String refund_fee;
    private String refund_id;
    private String seller_nick;
    private String tid;

    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getExtre() {
        return extre;
    }

    public void setExtre(String extre) {
        this.extre = extre;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getRefund_fee() {
        return refund_fee;
    }

    public void setRefund_fee(String refund_fee) {
        this.refund_fee = refund_fee;
    }

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    public String getSeller_nick() {
        return seller_nick;
    }

    public void setSeller_nick(String seller_nick) {
        this.seller_nick = seller_nick;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}
