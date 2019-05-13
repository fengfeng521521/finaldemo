package all.com.service;

import all.com.bean.Usertest;
import all.com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insertUser(Usertest user) {



            userMapper.inserttoUser(user);

    }
}
