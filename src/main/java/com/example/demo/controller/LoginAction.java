package com.example.demo.controller;

import com.example.demo.base.UserNotExistException;
import com.example.demo.pojo.User;
import com.example.demo.service.login.LoginServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/loginAction" ,method = {RequestMethod.GET})
public class LoginAction {
    @Autowired
    LoginServiceImpl loginService;


    Logger logger= LoggerFactory.getLogger(LoginAction.class);

    @RequestMapping(value="/loginFunction", method = {RequestMethod.GET})
    public String loginFunction(@RequestParam("id") Integer id, @RequestParam("password") String password) throws Exception{


        User currentUser=loginService.login(id,password);
        if(currentUser==null){
            return "账号或密码错误";
        }

            return currentUser.toString();

    }

}
