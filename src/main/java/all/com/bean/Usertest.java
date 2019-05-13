package all.com.bean;

import java.util.Objects;

public class Usertest {
    private  String username;
    private  String password;
    private  Integer age;

    public Usertest(String username, String password, Integer age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public Usertest() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usertest usertest = (Usertest) o;
        return Objects.equals(username, usertest.username) &&
                Objects.equals(password, usertest.password) &&
                Objects.equals(age, usertest.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, age);
    }

}
