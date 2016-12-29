package com.smart.org.service;

import com.smart.org.dao.UserDao;
import com.smart.org.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public User getUserInfo2() {
        return userDao.findUserInfo2();
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }


}
