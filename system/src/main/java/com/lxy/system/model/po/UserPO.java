package com.lxy.system.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@TableName("users")
public class UserPO implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(value = "user_id", type = IdType.INPUT)
    private String userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dateOfBirth;
    private Date registrationDate;
}
