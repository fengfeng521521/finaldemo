package all.com.bean;

import java.util.Objects;

public class ReturnFaceInfoList {
    private  Integer user_list_id;
    private  String group_id;
    private  String user_id;
    private  String user_info;
    private  float score;

    public Integer getUser_list_id() {
        return user_list_id;
    }

    public void setUser_list_id(Integer user_list_id) {
        this.user_list_id = user_list_id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_info() {
        return user_info;
    }

    public void setUser_info(String user_info) {
        this.user_info = user_info;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnFaceInfoList that = (ReturnFaceInfoList) o;
        return Float.compare(that.score, score) == 0 &&
                Objects.equals(user_list_id, that.user_list_id) &&
                Objects.equals(group_id, that.group_id) &&
                Objects.equals(user_id, that.user_id) &&
                Objects.equals(user_info, that.user_info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_list_id, group_id, user_id, user_info, score);
    }



}
