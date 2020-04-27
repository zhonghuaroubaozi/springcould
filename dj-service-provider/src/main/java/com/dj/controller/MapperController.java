package com.dj.controller;

import com.dj.domain.User;
import com.dj.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author Programmer Dj
 * @Date 2020/3/21 15:13
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class MapperController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("{id}")
    public User queryUser(@PathVariable("id") Integer id){
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        User user = userMapper.queryUserById(id);
        return user;
    }
}
