package com.smart.org.api.resource;

import com.smart.org.model.User;
import com.smart.org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by asus on 2016/12/29.
 */
@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/getAllUsers",method= RequestMethod.GET)
    public List<User> getUsers(){
        List<User> list=userService.getAllUsers();
        return list;
    }
}
