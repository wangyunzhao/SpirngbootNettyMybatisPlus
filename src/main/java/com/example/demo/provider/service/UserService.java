package com.example.demo.provider.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import com.example.demo.provider.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @program: demo
 * @description: 用户信息
 * @author: YunZhao.Wang
 * @create: 2020-11-16 14:54
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getUser(int channelId,int pageNo,int pageSize){
        Page<User> page = new Page<>(pageNo, pageSize);
        List<User> users = userDao.getUsers(channelId,page);
        return users;
    }
}
