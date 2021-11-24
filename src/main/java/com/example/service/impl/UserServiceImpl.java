package com.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.ShowMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ashes
 * @version 1.0
 * @description: 业务层实现类
 * @date 2021/11/22 16:05
 */
@Component
public class UserServiceImpl extends ServiceImpl<ShowMapper, User> implements UserService {

    @Autowired
    ShowMapper showMapper;

    @Override
    public IPage<User> findAll(Page<User> page) {
        return showMapper.findAll(page);
    }
}
