package com.smart.org.dao;


import com.smart.org.model.User;

import java.util.List;

/**
 * Created by asus on 2016/12/23.
 */
public interface UserDao {

    public User findUserInfo();

    public User findUserInfo2();

    public List<User> getAllUsers();
}
