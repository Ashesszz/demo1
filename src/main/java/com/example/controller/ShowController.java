package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ashes
 * @version 1.0
 * @description: 控制层
 * @date 2021/11/19 10:01
 */
@ResponseBody
@Controller
public class ShowController {

    @Autowired
    private UserService userService;

    /**
     * @description: 获取分页数据
     * @author: Ashes
     * @param: current
     * @param: size
     * @return: com.baomidou.mybatisplus.core.metadata.IPage<com.example.pojo.User>
     */
    @GetMapping("/findAll/{current}/{size}")
    public IPage<User> findAll(@PathVariable("current") Integer current, @PathVariable("size") Integer size) {
        Page<User> page = new Page<>(current, size);
        IPage<User> iPage = userService.findAll(page);
        if (iPage.getRecords().size() == 0) {
            page.setCurrent(current - 1);
        }
        return userService.findAll(page);
    }

    /**
     * @description: 添加一条数据
     * @author: Ashes
     * @param: user
     * @return: java.lang.String
     */
    @PutMapping("/save")
    public String save(@RequestBody User user) {
        boolean save = userService.save(user);
        if (save) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * @description: 根据id查询数据
     * @author: Ashes
     * @param: id
     * @return: com.example.pojo.User
     */
    @GetMapping("/selectById/{id}")
    public User selectById(@PathVariable("id") Integer id) {
        return userService.getById(id);
    }

    /**
     * @description: 根据id更新数据
     * @author: Ashes
     * @param: user
     * @return: java.lang.String
     */
    @PutMapping("/updateById")
    public String updateById(@RequestBody User user) {
        boolean update = userService.updateById(user);
        if (update) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * @description: 根据id删除数据
     * @author: Ashes
     * @param: id
     * @return: java.lang.String
     */
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean delete = userService.removeById(id);
        if (delete) {
            return "success";
        } else {
            return "error";
        }
    }
}
