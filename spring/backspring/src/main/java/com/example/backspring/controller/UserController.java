package com.example.backspring.controller;

import com.example.backspring.mapper.UserMapper;
import com.example.backspring.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController extends HttpController<UserMapper,User> {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/elregister")
    public String hello(){

        return "hello world";
    }

    @RequestMapping("/ellogin")
    public Map<String,Object> login(String username,String password) {
        System.out.println(username + "..." + password);
        User user = userMapper.select(new User(null, username, password,null));
        Map<String,Object> map = new HashMap<>();
        if (user != null) {
            map.put("code",1);
            map.put("uid",user.getId());
            map.put("user",user.getUsername());
            map.put("status",user.getStatus());
        } else {
            map.put("code",0);
        }
        return map;
    }
}