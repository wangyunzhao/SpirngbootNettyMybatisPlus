package com.example.demo.provider.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import com.example.demo.provider.dao.UserDao;
import com.example.demo.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: demo
 * @description: 用户信息
 * @author: YunZhao.Wang
 * @create: 2020-11-16 14:53
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{name}")
    public List<User> getUser(@PathVariable String name,
                              @RequestParam int channelId,
                              @RequestParam int pageNo,
                              @RequestParam int pageSize){

        return userService.getUser(channelId,pageNo,pageSize);
    }
}
