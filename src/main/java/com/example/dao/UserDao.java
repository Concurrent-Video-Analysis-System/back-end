package com.example.dao;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.entity.User;

@Mapper
public interface UserDao {

	/**
	 * 
	 * @查询全部用户信息
	 */
	@Select("select * from user")
	List<User> getUsers();
	
	/**
	 * 
	 * @param user_id
	 * @根据用户id查询单个用户信息
	 */
	@Select("select * from user where user_id=#{user_id}")
	User getUsersById(String user_id);
	
	/**
	 * 
	 * @param user_id
	 * @查询用户等级，进入不同界面
	 */
	@Select("select user_level from user where user_id=#{user_id}")
	String getLevelById(String user_id);
	
	/**
	 * 
	 * @param user_id
	 * @param user_name
	 * @param user_level
	 * @param password
	 * @param mobile
	 * @插入用户信息
	 */
	@Insert("INSERT INTO user VALUES(#{user_id},#{user_name},#{user_level},#{password},#{mobile},#{cancellation}=1)")
	void InsertUser(String user_id,String user_name,String user_level,String password,String mobile);
	
	/**
	 * 
	 * @param user_id
	 * @param col_name
	 * @param newdata
	 * @param password
	 * @修改用户信息，根据user_id和password
	 */
	@Update("UPDATE user SET #{col_name} = #{newdata}  WHERE user_id = #{user_id} AND password = #{password}")
	void UpdateUser(String user_id,String col_name,String newdata,String password);
	
	/**
	 * 
	 * @param user_id
	 * @删除用户信息，将注销字段设为0
	 */
	@Update("UPDATE user SET cancellation = 0  WHERE user_id = #{user_id}")
	void DelectUser(String user_id);
	
	/**
	 * 
	 * @param user
	 * @param session 
	 * @登录功能
	 */
	@Select("select count(*) from user where user_name=#{user_name} and password=#{password}")
	int Login(String user_name,String password);
	
	/**
	 * 
	 * @param user_id
	 * @根据user_id查找user_name
	 */
	@Select("SELECT user_name FROM  user WHERE user_id = #{user_id}")
	String GetUserNameById(String user_id);
	
	/**
	 * 
	 * @param user_name
	 * @根据user_id查找user_name
	 */
	@Select("SELECT user_id FROM  user WHERE user_name = #{user_name}")
	String GetUserIdByName(String user_name);
}
