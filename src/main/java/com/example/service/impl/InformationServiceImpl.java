/**
 * 
 */
package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.InformationDao;
import com.example.entity.Information;
import com.example.service.InformationService;

/**
 * @author 
 *
 */
@Service
public class InformationServiceImpl implements InformationService{

	@Autowired
	InformationDao inf;

	/**
	 * 获取全部信息
	 */
	@Override
	public List<Information> getAllInformation() {
		// TODO Auto-generated method stub
		return inf.getAllInformation();
	}

	/**
	 * 查询某个网点的全部信息
	 */
	@Override
	public List<Information> getInformationByOutlet(String outlet) {
		// TODO Auto-generated method stub
		return inf.getInformationByOutlet(outlet);
	}

	/**
	 * 根据information_id查询某条信息
	 */
	@Override
	public void delectInformationById(String information_id) {
		// TODO Auto-generated method stub
		inf.delectInformationById(information_id);
	}

	/**
	 * 插入新的信息
	 */
	@Override
	public int Insertformation(String information_id, String outlet, String image_data,String classes,String class_name,String predict_data,boolean ifhandle) {
		// TODO Auto-generated method stub
		inf.Insertformation(information_id, outlet, image_data,classes,class_name,predict_data,ifhandle);
		return 1;
	}

	/**
	 * 查询未处理的全部信息
	 */
	@Override
	public List<Information> getInformationByIfhandle(boolean ifhandle) {
		// TODO Auto-generated method stub
		return inf.getInformationByIfhandle(ifhandle);
	}

	/**
	 * 处理信息
	 */
	@Override
	public void HandleInformation(String information_id) {
		// TODO Auto-generated method stub
		inf.HandleInformation(information_id);
	}
}
