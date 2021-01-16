package com.example.demo.util;

import com.example.demo.pojo.User;

import java.util.Date;
import java.util.Map;

public class CommonUtils {
    public static User transferMapToUser(Map UserResultMap){
        Integer id=(Integer)UserResultMap.get("id");
        String username=(String)UserResultMap.get("username");
        String password=(String)UserResultMap.get("password");
        String email=(String)UserResultMap.get("email");
        String phone=(String)UserResultMap.get("phone");
        String question=(String)UserResultMap.get("question");
        String answer=(String)UserResultMap.get("answer");
        Date createtime=(Date)UserResultMap.get("createtime");
        Date updatetime=(Date)UserResultMap.get("updatetime");
        //创建User对象
        User user=new User(id,username,password,email,phone,question,answer,createtime,updatetime);

        return user;
    }
}
