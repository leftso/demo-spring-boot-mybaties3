package com.leftso;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.leftso.mapper.UserMapper;
import com.leftso.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	Logger log = LoggerFactory.getLogger(getClass());
	@Autowired
	UserMapper userMapper;

	// @Test
	public void add() {
		try {
			User user = new User();
			user.setUserName("测试用户名");
			user.setAge(25);
			user.setSex("男");
			log.info("新增前ID：" + user.getId());
			userMapper.add(user);
			log.info("新增后ID：" + user.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void remove() {
		try {
			userMapper.remove(2l);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void update() {
		try {
			User user = new User();
			user.setId(3l);
			user.setUserName("我是修改");
			user.setAge(2);
			userMapper.update(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void findOne() {
		try {
			User user = userMapper.findOne(3l);
			log.info("\nName:" + user.getUserName() + "\nAge:" + user.getAge() + "\nSex:" + user.getSex());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void findList() {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("name", "我");
			params.put("age", 3);
			List<User> list = userMapper.findList(params);
			for (User user : list) {
				log.info("\nName:" + user.getUserName() + "\nAge:" + user.getAge() + "\nSex:" + user.getSex());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
