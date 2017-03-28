package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.pojo.User;

public interface UserMapper {
	/**
	 * 查询所有用户信息
	 * 
	 * @return
	 */
	@Select("select * from user")
	@Results(value = { @Result(property = "userSex", column = "user_sex", javaType = String.class),
			@Result(property = "userName", column = "user_name"), @Result(property = "userAge", column = "user_age") })
	List<User> findList();

	/**
	 * 通过ID查询
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from user u where u.id=#{id}")
	User findOne(@Param("id") Long id);

	/**
	 * 新增一个
	 * 
	 * @param user
	 */
	@Insert("insert into user (user_name,user_sex,user_age) values(#{userName},#{userSex},#{userAge})")
	void insert(User user);

	/**
	 * 修改
	 * 
	 * @param user
	 */
	@Update("update user u set u.user_name=#{userName},u.user_sex=#{userSex},u.user_age=#{userAge} where u.id=#{id}")
	void update(User user);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	@Delete("delete from user where id=#{id}")
	void delete(@Param("id") Long id);
}
