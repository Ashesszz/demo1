package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.User;

/**
 * @author Ashes
 * @version 1.0
 * @description: 业务层
 * @date 2021/11/22 16:04
 */
public interface UserService extends IService<User> {
    IPage<User> findAll(Page<User> page);
}
