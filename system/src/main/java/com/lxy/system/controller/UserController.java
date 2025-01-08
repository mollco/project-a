package com.lxy.system.controller;

import com.lxy.system.model.po.UserPO;
import com.lxy.system.service.UserService;
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

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Result int insert(@RequestBody UserPO userPO) {
        logger.info("register user:{}", userPO);
        return userService.register(userPO);
    }

    @RequestMapping(value = "/selectUser", method = RequestMethod.POST)
    public UserPO selectUser(@RequestBody UserPO userPO) {
        logger.info("selectUser user:{}", userPO);
        return userService.selectUser(userPO);
    }
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public int updateUser(@RequestBody UserPO userPO) {
        logger.info("updateUser user:{}", userPO);
        return userService.updateUser(userPO);
    }
    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public int deleteUser(@RequestBody UserPO userPO) {
        logger.info("deleteUser user:{}", userPO);
        return userService.deleteUser(userPO);
    }


}
