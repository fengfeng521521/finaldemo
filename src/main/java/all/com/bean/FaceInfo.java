package all.com.bean;

import org.springframework.context.annotation.Bean;

import java.util.Objects;

public class FaceInfo {

    private String groupId;
    private String groupName;
    private Integer userId;
    private String userName;


    public FaceInfo(String groupId, String groupName, Integer userId, String userName) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.userId = userId;
        this.userName = userName;
    }

    public FaceInfo(String groupName, String userName) {
        this.groupName = groupName;
        this.userName = userName;
    }

    public FaceInfo() {

    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FaceInfo faceInfo = (FaceInfo) o;
        return Objects.equals(groupId, faceInfo.groupId) &&
                Objects.equals(groupName, faceInfo.groupName) &&
                Objects.equals(userId, faceInfo.userId) &&
                Objects.equals(userName, faceInfo.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, userId, userName);
    }

    @Override
    public String toString() {
        return "FaceInfo{" +
                "groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
