package com.example.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mapper.UserMapper;
import com.example.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;

	// @Test
	public void testInsert() {
		try {
			userMapper.insert(new User("xqlee1", "男", 26));
			userMapper.insert(new User("xqlee2", "男", 23));
			userMapper.insert(new User("xqlee3", "男", 27));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void testUpdate() {
		try {
			User user = new User("测试0000", "男", 23);
			user.setId(1l);
			userMapper.update(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//@Test
	public void testQuery() {
		try {
			List<User> users=userMapper.findList();
			for(User u:users){
				System.out.println("ID:"+u.getId()+" Name:"+u.getUserName()+" Sex:"+u.getUserSex()+" Age:"+u.getUserAge());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDelete(){
		try {
			userMapper.delete(1l);
			testQuery();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}
