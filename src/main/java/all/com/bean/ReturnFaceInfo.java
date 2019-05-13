package all.com.bean;

import java.util.Objects;

public class ReturnFaceInfo {
    private  Integer face_return_id;
    private  String face_token;
    private  Integer user_list_id;

    public Integer getFace_return_id() {
        return face_return_id;
    }

    public void setFace_return_id(Integer face_return_id) {
        this.face_return_id = face_return_id;
    }

    public String getFace_token() {
        return face_token;
    }

    public void setFace_token(String face_token) {
        this.face_token = face_token;
    }

    public Integer getUser_list_id() {
        return user_list_id;
    }

    public void setUser_list_id(Integer user_list_id) {
        this.user_list_id = user_list_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnFaceInfo that = (ReturnFaceInfo) o;
        return Objects.equals(face_return_id, that.face_return_id) &&
                Objects.equals(face_token, that.face_token) &&
                Objects.equals(user_list_id, that.user_list_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(face_return_id, face_token, user_list_id);
    }
}
