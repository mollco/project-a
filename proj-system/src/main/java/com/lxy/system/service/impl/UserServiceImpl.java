package com.org.mollcol.service.impl;

import cn.hutool.core.util.IdUtil;
import com.org.mollcol.mapper.UserMapper;
import com.org.mollcol.model.po.UserPO;
import com.org.mollcol.service.UserService;
import com.org.mollcol.util.RedisUtil;
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
    @Resource
    private RedisUtil redisUtil;

    @Override
    public int insert(UserPO userPO) {
        userPO.setUserId(IdUtil.simpleUUID());
        userPO.setRegistrationDate(new Date());
        redisUtil.set(userPO.getUserId(), userPO);
        return userMapper.insert(userPO);
    }

    @Override
    public UserPO selectUser(UserPO userPO) {
        String cmd = "cmd /c \"E: && dir && cd gitBackup && dir && pullAll.bat\"";

        if (redisUtil.hasKey(userPO.getUserId())) {
            return (UserPO) redisUtil.get(userPO.getUserId());
        }
        return null;
    }
}
