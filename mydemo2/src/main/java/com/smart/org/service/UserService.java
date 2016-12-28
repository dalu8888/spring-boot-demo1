package com.smart.org.service;

import com.smart.org.dao.UserDao;
import com.smart.org.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by asus on 2016/12/22.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfo() {
        return userDao.findUserInfo();
    }

}