package com.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pojo.User;
import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VuetestApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void contextLoads() {
		Page<User> page = new Page<>(1,5);
		IPage<User> all = userService.findAll(page);
		JSONObject o =(JSONObject) JSON.toJSON(all);
		System.out.println(o);
	}

	@Test
	void insert(){
		User user = new User();
		user.setUsername("tt");
		user.setPassword("tt");
		boolean save = userService.save(user);
		System.out.println(save);
	}

	@Test
	void selectById(){
		int id = 5;
		System.out.println(userService.getById(id));
	}


	@Test
	void updateById(){
		User user = new User(2,"123","321");
		boolean b = userService.updateById(user);
		System.out.println(b);
	}

	@Test
	void deleteById(){
		int id = 10;
		boolean b = userService.removeById(id);
		System.out.println(b);
	}

}
