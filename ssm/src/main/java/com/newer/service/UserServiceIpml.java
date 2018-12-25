package com.newer.service;

import com.newer.dao.UserMapper;
import com.newer.domain.User;
import com.newer.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class UserServiceIpml implements UserService {
   @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String userName, String password) {
     String password1 = MD5.getInstance().getMD5ofStr(password);
     return userMapper.findUser(userName,password1);
    }
}
