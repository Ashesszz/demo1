package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ashes
 * @version 1.0
 * @description: 用户表实体类
 * @date 2021/11/19 9:58
 */
@TableName("t_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    //uuid可做主键
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private String username;

    private String password;
}
