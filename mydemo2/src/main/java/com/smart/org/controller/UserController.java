package com.smart.org.controller;

import com.smart.org.model.User;
import com.smart.org.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by asus on 2016/12/22.
 */
@Controller
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /*
     *  http://localhost:8080/getUserInfo
     */

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if(user!=null){
//            System.out.println("user.getId():"+user.getId().toString());
            System.out.println("user.getName():"+user.getName());
            logger.info("user.getAge():"+user.getAge());
        }
        return user;
    }

    @RequestMapping("/getUserInfo2")
    @ResponseBody
    public User getUserInfo2() {
        User user = userService.getUserInfo2();
        if(user!=null){
//            System.out.println("user.getId():"+user.getId().toString());
            System.out.println("user.getName():"+user.getName());
            logger.info("user.getAge():"+user.getAge());
        }
        return user;
    }


    /*
     *  http://localhost:8080/getAllUsers
     */
//    @RequestMapping("/getAllUsers")
//    @ResponseBody
//    @GetMapping
//    public ModelAndView getAllUsers(Model model) {
//        List<User> users=userService.getAllUsers();
//        return new ModelAndView("/list", "users", users);
//    }

    @RequestMapping("/")
    public String list(Model model) {
        List<User> users=userService.getAllUsers();
        model.addAttribute("users",users);
        return "list";
    }

}
