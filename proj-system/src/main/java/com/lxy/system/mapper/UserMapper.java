package com.org.mollcol.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.org.mollcol.model.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper <UserPO>{
    int insertUser(UserPO userPO);
}
