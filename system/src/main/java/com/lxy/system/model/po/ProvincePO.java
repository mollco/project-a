package com.org.mollcol.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("city")
public class ProvincePO {
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    private String code;
    private String name;
    private String province;
    private String city;
    private String area;
    private String town;

}
