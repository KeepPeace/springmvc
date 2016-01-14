package message.entity;

/**
 * ActionInfo
 *
 * @author Wang yong
 * @date 2016/1/11
 */
public class AuctionInfo {
    private String detail_order_id;
    private String auction_id;
    private String auction_pict_url;
    private String auction_title;
    private String auction_amount;

    public String getDetail_order_id() {
        return detail_order_id;
    }

    public void setDetail_order_id(String detail_order_id) {
        this.detail_order_id = detail_order_id;
    }

    public String getAuction_id() {
        return auction_id;
    }

    public void setAuction_id(String auction_id) {
        this.auction_id = auction_id;
    }

    public String getAuction_pict_url() {
        return auction_pict_url;
    }

    public void setAuction_pict_url(String auction_pict_url) {
        this.auction_pict_url = auction_pict_url;
    }

    public String getAuction_title() {
        return auction_title;
    }

    public void setAuction_title(String auction_title) {
        this.auction_title = auction_title;
    }

    public String getAuction_amount() {
        return auction_amount;
    }

    public void setAuction_amount(String auction_amount) {
        this.auction_amount = auction_amount;
    }
}
