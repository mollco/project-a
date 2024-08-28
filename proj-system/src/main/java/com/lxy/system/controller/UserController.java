package com.org.mollcol.controller;

import com.org.mollcol.model.po.UserPO;
import com.org.mollcol.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Service
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public int insert(@RequestBody UserPO userPO) {
        logger.info("insert user:{}", userPO);
        return userService.insert(userPO);
    }
    @RequestMapping(value = "/selectUser", method = RequestMethod.POST)
    public UserPO selectUser(@RequestBody UserPO userPO) {
        logger.info("selectUser user:{}", userPO);
        return userService.selectUser(userPO);
    }
    @RequestMapping(value = "/queryUserList", method = RequestMethod.POST)
    public UserPO queryUserList(@RequestBody UserPO userPO) {
        logger.info("queryUserList user:{}", userPO);
        return userService.queryUserList(userPO);
    }

}
