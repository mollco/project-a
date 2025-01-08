package com.lxy.system.service;


import com.lxy.system.model.po.UserPO;

public interface UserService {
    /**
     * 注册用户
     * @param userPO 用户信息
     * @return 是否成功
     */
    int register(UserPO userPO);

    UserPO selectUser(UserPO userPO);
    int updateUser(UserPO userPO);
    int deleteUser(UserPO userPO);

}
