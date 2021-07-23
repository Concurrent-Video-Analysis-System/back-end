package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.entity.log_information;
import com.example.service.LogService;
import com.example.token.UserLoginToken;




@Controller
@ResponseBody
public class LogController {

	@Autowired
	private LogService service;
	
	/**
	 * 
	 * @return 全部日志信息
	 */
	@UserLoginToken
	@RequestMapping("/getInformation")
	@ResponseBody
	List<log_information> getInformation(){
		
		return service.getInformation();
	}
	
	/**
	 * 
	 * @param log_id
	 * @return 单个日志信息
	 */
	@RequestMapping("/getInformationById")
	@ResponseBody
	log_information getInformationById(String log_id) {
		
		return service.getInformationById(log_id);
	}
	
	/**
	 * 
	 * @param user_id
	 * @return 某个information_id的全部记录
	 */
	@RequestMapping("/getInformationByInformationId")
	@ResponseBody
	List<log_information> getInformationByInformationId(String information_id)
	{
		return service.getInformationByInformationId(information_id);
	}
	
	/**
	 * 
	 * @param description
	 * @return 特定违规行为的全部记录
	 */
	@UserLoginToken
	@RequestMapping("/getInformationBydes")
	@ResponseBody
	List<log_information> getInformationBydes(String description)
	{
		return service.getInformationBydes(description);
	}
	
	/**
	 * 
	 * @param log_id
	 * @param video_id
	 * @param user_id
	 * @param starttime
	 * @param endtime
	 * @param description
	 * @插入一条日志信息
	 */
	@UserLoginToken
	@RequestMapping("/insertInformation")
	@ResponseBody
	List<log_information> insertInformation(String log_id,String information_id,String time,String description,String location)
	{
		service.insertInformation(log_id, information_id, time, location, description);
		return service.getInformation();
	}
	
	/**
	 * 
	 * @param log_id
	 * @删除一条日志信息
	 */
	@UserLoginToken
	@RequestMapping("/delectInformation")
	@ResponseBody
	void delectInformation(String log_id)
	{
		return ;
	}
	
	/**
	 * 
	 * @param location
	 * @查询某个网点的全部违规记录
	 */
	@UserLoginToken
	@RequestMapping("/getInformationByPosition")
	@ResponseBody
	List<log_information> getInformationByPosition(String location)
	{
		return service.getInformationByPosition(location);
	}
	/**
	 * 
	 * @param time1
	 * @param time2
	 * @查询两个时间之间的全部记录
	 */
	@UserLoginToken
	@RequestMapping("/getInformationByTime")
	@ResponseBody
	List<log_information> getInformationByTime(String time1,String time2)
	{
		return service.getInformationByTime(time1, time2);
	}
}
