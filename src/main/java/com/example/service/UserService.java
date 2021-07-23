package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {

	List<User> getUsers();
	
	User getUsersById(String user_id);
	
	String getLevelById(String user_id);
	
	void InsertUser(String user_id,String user_name,String user_level,String password,String mobile);
	
	void UpdateUser(String user_id,String col_name,String newdata,String password);
	
	void DelectUser(String user_id);
	
	int Login(String user_name,String password);
	
	String GetUserIdByName(String user_name);
}
