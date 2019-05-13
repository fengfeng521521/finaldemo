package all.com.bean;

import java.util.Objects;

public class User {

    private  Integer userid;
    private  String name;
    private  Integer userage;


    public User(Integer userid, String name, Integer userage) {
        this.userid = userid;
        this.name = name;
        this.userage = userage;
    }

    public User() {

    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userid, user.userid) &&
                Objects.equals(name, user.name) &&
                Objects.equals(userage, user.userage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, name, userage);
    }


}
