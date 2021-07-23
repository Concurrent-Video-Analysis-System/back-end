/**
 * 
 */
package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Information;
import com.example.service.InformationService;
import com.example.token.UserLoginToken;

/**
 * @author 
 *
 */
@Controller
@ResponseBody
public class InformationController {

	@Autowired
	private InformationService service;
	
	/**
	 * 
	 * @return全部信息
	 */
	@UserLoginToken
	@RequestMapping("/getAllInformation")
	@ResponseBody
	public List<Information> getAllInformation(){
		return service.getAllInformation();
	}
	
	/**
	 * 
	 * @param outlet
	 * @return某个网点的全部信息
	 */
	@UserLoginToken
	@RequestMapping("/getInformationByOutlet")
	@ResponseBody
	public List<Information> getInformationByOutlet(String outlet)
	{
		return service.getInformationByOutlet(outlet);
	}
	
	/**
	 * 
	 * @param ifhandle
	 * @return未处理的全部信息
	 */
	@UserLoginToken
	@RequestMapping("/getInformationByIfhandle")
	@ResponseBody
	public List<Information> getInformationByIfhandle(boolean ifhandle)
	{
		return service.getInformationByIfhandle(ifhandle);
	}
	
	/**
	 * 
	 * @param information_id
	 * 根据Information_id删除信息
	 */
	@UserLoginToken
	@RequestMapping("/delectInformationById")
	@ResponseBody
	public void delectInformationById(String information_id)
	{
		service.delectInformationById(information_id);
	}
	
	/**
	 * 
	 * @param information_id
	 * @param outlet
	 * @param position
	 * @param ifhandle
	 * @插入信息
	 */
	@RequestMapping("/Insertformation")
	@ResponseBody
	public void InsertInformation( HttpServletRequest request)
	{
		Information inf=new Information();
		//System.out.print(information_id+outlet+picture+box+ifhandle);
		String image_data=request.getParameter("image_data");
		String classes=request.getParameter("class");
		String class_name=request.getParameter("class_name");
		String predict_data=request.getParameter("predict_data");
		String outlet=request.getParameter("outlet");
		inf.setImage_data(image_data);
		inf.setClass_name(class_name);
		inf.setClasses(classes);
		inf.setIfhandle(false);
		inf.setPredict_data(image_data);
		inf.setInformation_id(predict_data);
		inf.setOutlet(predict_data);
		service.Insertformation(predict_data, predict_data, image_data, classes, class_name, outlet, false);
	}
	
	/**
	 * 
	 * @param information_id
	 * 处理信息
	 */
	@UserLoginToken
	@RequestMapping("/HandleInformation")
	@ResponseBody
	public void HandleInformation(String information_id)
	{
		service.HandleInformation(information_id);
	}
}
