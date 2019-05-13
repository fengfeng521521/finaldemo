package all.com.service;

import all.com.bean.Usertest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void insertUser(Usertest user);
}
