package com.lxy.system.service.impl;

import cn.hutool.core.util.IdUtil;
import com.lxy.system.mapper.UserMapper;

import com.lxy.system.model.po.UserPO;
import com.lxy.system.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserMapper userMapper;

    @Override
    public int register(UserPO userPO) {
        userPO.setUserId(IdUtil.simpleUUID());
        userPO.setRegistrationDate(new Date());
        return userMapper.insert(userPO);
    }

    @Override
    public UserPO selectUser(UserPO userPO) {
        return userMapper.selectById(userPO);
    }

    @Override
    public int updateUser(UserPO userPO) {
        return 0;
    }

    @Override
    public int deleteUser(UserPO userPO) {
        return 0;
    }

}
