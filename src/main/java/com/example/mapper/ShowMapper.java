package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Ashes
 * @date 2021/11/24 15:55
 * @description: 持久层
 */
@Mapper
public interface ShowMapper extends BaseMapper<User> {

    /**
     * @description: 获取分页数据
     * @author: Ashes
     * @param: page
     * @return: com.baomidou.mybatisplus.core.metadata.IPage<com.example.pojo.User>
     */
    IPage<User> findAll(Page<User> page);
}
