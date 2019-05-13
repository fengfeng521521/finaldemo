package all.com.mapper;

import all.com.bean.Usertest;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public void inserttoUser(Usertest user);
}
