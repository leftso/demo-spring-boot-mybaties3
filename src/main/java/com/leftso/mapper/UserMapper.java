package com.leftso.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.leftso.pojo.User;

@Component("userMapper")
public interface UserMapper {
	// 新增
	int add(User user);

	// 修改
	int remove(Long id);

	// 删除
	int update(User user);

	// 查一个
	User findOne(Long id);

	// 查多个
	List<User> findList(Map<String, Object> params);

}
