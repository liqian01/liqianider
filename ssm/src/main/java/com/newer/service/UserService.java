package com.newer.service;

import com.newer.domain.User;

public interface UserService {
    User login(String userName,String password);
}
