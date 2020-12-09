package com.example.demo.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.nio.channels.Channel;
import java.util.List;

@Mapper
@Repository
public interface UserDao extends BaseMapper<User> {
    @Select("select * from cpas_account_info where channel_id = #{channelId}")
    List<User> getUsers(@Param("channelId")int channelId, Page<User> page);
}
