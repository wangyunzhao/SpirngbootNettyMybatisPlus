package com.example.demo.provider.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.MJEntity;
import com.example.demo.entity.User;
import com.example.demo.provider.dao.UserDao;
import com.example.demo.provider.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "user用户接口", description = "user用户接口", tags = "01_user")
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

    @PostMapping("/getUser/mjEntity")
    @ApiOperation(value = "枚举传值", notes = "枚举传值")
    public MJEntity getUser(@RequestBody MJEntity mjEntity){
        System.out.println(mjEntity.getPubDateEnum());
        return mjEntity;
    }
}
