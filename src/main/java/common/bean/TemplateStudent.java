package common.bean;

public class TemplateStudent {

    private int tmpId;
    private int sid;
    private String sname;
    private int status;
    private int createTime;
    private int updateTime;


    public int getTmpId() {
        return tmpId;
    }

    public void setTmpId(int tmpId) {
        this.tmpId = tmpId;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

}
