package com.etyy.controller;

import com.etyy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenmingjiang on 2016/7/23.
 */
@Controller
public class UserController {

    /*@RequestMapping(value = "/ajaxUser")
    public
    @ResponseBody
    void ajaxUser(String username) {
        System.out.println(username);
    }*/


    @RequestMapping(value = "/ajaxUser")
    public
    @ResponseBody
    User getUser(String username) {
        System.out.println(username);
        User user = new User();
        user.setUsername(username);
        user.setPassword("123");
        return user;
    }
}
