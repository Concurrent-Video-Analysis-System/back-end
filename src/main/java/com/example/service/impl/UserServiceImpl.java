package com.example.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;
	
	@Override
	public List<User> getUsers() {
		
		return userdao.getUsers();
	}

	@Override
	public User getUsersById(String user_id) {
		// TODO Auto-generated method stub
		return userdao.getUsersById(user_id);
	}

	@Override
	public String getLevelById(String user_id) {
		// TODO Auto-generated method stub
		return userdao.getLevelById(user_id);
	}

	@Override
	public void InsertUser(String user_id, String user_name, String user_level, String password, String mobile) {
		// TODO Auto-generated method stub
		userdao.InsertUser(user_id, user_name, user_level, password, mobile);
	}

	@Override
	public void UpdateUser(String user_id, String col_name, String newdata, String password) {
		// TODO Auto-generated method stub
		userdao.UpdateUser(user_id, col_name, newdata, password); ;
	}

	@Override
	public void DelectUser(String user_id) {
		// TODO Auto-generated method stub
		userdao.DelectUser(user_id); ;
	}
	@Override
	public String GetUserIdByName(String user_name)
	{
		return userdao.GetUserIdByName(user_name);
	}

	/**
	 * 登陆界面，从前端获取user_id和password，查找到user_name，成功返回1
	 */
	@Override
	public int Login(String user_name,String password) {
		// TODO Auto-generated method stub
		if(userdao.Login(user_name,password)==1)
		{
			return 1;
		}
		return 0;
	}

}
