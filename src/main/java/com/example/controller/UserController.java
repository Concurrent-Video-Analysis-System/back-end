package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.entity.User;
import com.example.service.UserService;
import com.example.token.TokenService;
import com.example.token.UserLoginToken;

import net.sf.json.JSONObject;




@Controller
@ResponseBody
public class UserController {

	@Autowired
	private UserService service;
	@Autowired
    TokenService tokenService;
	
	/**
	 * 
	 * 获取全部用户信息返回前端
	 */
	@RequestMapping("/getUsers")
	@ResponseBody
	public List<User> getUsers(){
		
		return service.getUsers();
	}
	
	/**
	 * 
	 * @param user_id
	 * 传入参数use_id，查找用户信息返回前端
	 */
	@RequestMapping("/getUsersById")
	@ResponseBody
	public User getUsersById(String user_id) {
		
		return service.getUsersById(user_id);
	}
	
	/**
	 * 
	 * @param user_id
	 * 用户等级区别不同用户界面，根据user_id查找用户等级
	 */
	@RequestMapping("/getLevelById")
	@ResponseBody
	public String getLevelById(String user_id) {
		
		return service.getLevelById(user_id);
	}
	
	/**
	 * 
	 * @param user_id
	 * @param user_name
	 * @param user_level
	 * @param password
	 * @param mobile
	 * 创建新的用户
	 */
	@RequestMapping("/InsertUser")
	@ResponseBody
	public void InsertUser(String user_id,String user_name,String user_level,String password,String mobile){
		
		service.InsertUser(user_id, user_name, user_level, password, mobile);
		return ;
	}
	
	/**
	 * 
	 * @param user_id
	 * @param col_name
	 * @param newdata
	 * @param password
	 * 修改用户信息，仅限修改password或mobil
	 */
	@RequestMapping("/UpdateUser")
	@ResponseBody
	public void UpdateUser(String user_id,String col_name,String newdata,String password)
	{
		service.UpdateUser(user_id, col_name, newdata, password);
		return ;
	}
	
	/**
	 * 
	 * @param user_id
	 * 删除用户信息，将注销字段设为0
	 */
	@RequestMapping("/DelecUser")
	@ResponseBody
	public void  DelectUser(String user_id)
	{
		service.DelectUser(user_id);
		return ;
	}
	
	/**
	 * 
	 * @param user
	 * @登录功能，登陆成功返回全部信息界面
	 */
	@RequestMapping("/Login")
	@ResponseBody
	public Object Login(String user_name,String password) {
		
		JSONObject jsonObject=new JSONObject();
		System.out.print(service.Login(user_name, password));
		 if(service.Login(user_name, password)==0){
	            jsonObject.put("message","登录失败,账户或密码错误");
	            return jsonObject;
	            }
	        else {
	        	    String user_id=service.GetUserIdByName(user_name);
	        	    User user=service.getUsersById(user_id);
	                String token = tokenService.getToken(user);
	                jsonObject.put("token", token);
	                jsonObject.put("user_id", user_id);
	                jsonObject.put("user_name", user_name);
	                return jsonObject;
            }
        }
	@UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){
        
		return "你已通过验证";
    }
	}
