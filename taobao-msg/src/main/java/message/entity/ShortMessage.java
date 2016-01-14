package message.entity;

/**
 * ShortMessage
 *
 * @author Wang yong
 * @date 2016/1/11
 */
public class ShortMessage {
    private String id;
    private boolean is_successful;
    private String task_id;
    private String mobile;

    public String getId() {
        return id;
    }

    public boolean is_successful() {
        return is_successful;
    }

    public String getTask_id() {
        return task_id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIs_successful(boolean is_successful) {
        this.is_successful = is_successful;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
