package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.login.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping(value="/loginAction" ,method = {RequestMethod.GET})
public class LoginAction {
    @Autowired
    LoginServiceImpl loginService;



    @RequestMapping(value="/loginFunction", method = {RequestMethod.GET})
    public void loginFunction(@RequestParam("id") Integer id, @RequestParam("password") String password){

        User currentUser=loginService.login(id,password);
        System.out.println("登录成功");
    }

}
