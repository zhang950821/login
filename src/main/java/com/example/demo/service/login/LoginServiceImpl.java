package com.example.demo.service.login;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.util.CommonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;



@Service
public class LoginServiceImpl {


    @Autowired
    UserMapper userMapper;

    Logger logger= LoggerFactory.getLogger(LoginServiceImpl.class);

    public User login(Integer id, String password) {

        //检查id是否存在
        Integer isExist=userMapper.checkId(id);
        if(isExist==0){
            logger.warn("id不存在");
        }

        //检查id和密码是否匹配
        Map checkedUserMap=userMapper.checkUser(id,password);
        if(checkedUserMap==null){
            logger.warn("用户名或密码错误");
        }
        //将userMap转化为user对象
        User checkedUser= CommonUtils.transferMapToUser(checkedUserMap);

        //校验成功则将
        return checkedUser;
    }
}
