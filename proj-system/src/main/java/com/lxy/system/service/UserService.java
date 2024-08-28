package com.org.mollcol.service;

import com.org.mollcol.model.po.UserPO;

public interface UserService {
    int insert(UserPO userPO);

    UserPO selectUser(UserPO userPO);
}
