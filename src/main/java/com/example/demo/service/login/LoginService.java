package com.example.demo.service.login;

import com.example.demo.pojo.User;

public interface LoginService {
    User login(int id, String password);
}
