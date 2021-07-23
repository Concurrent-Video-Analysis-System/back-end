package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Log_InformationDao;
import com.example.service.LogService;

@Service
public class LogServiceImpl implements LogService{

	@Autowired
	private Log_InformationDao log_information;

	@Override
	public List<com.example.entity.log_information> getInformation() {
		// TODO Auto-generated method stub
		return log_information.getInformation();
	}

	@Override
	public com.example.entity.log_information getInformationById(String log_id) {
		// TODO Auto-generated method stub
		return log_information.getInformationById(log_id);
	}

	@Override
	public List<com.example.entity.log_information> getInformationByInformationId(String information_id) {
		// TODO Auto-generated method stub
		return log_information.getInformationByInformationrId(information_id);
	}

	@Override
	public List<com.example.entity.log_information> getInformationBydes(String description) {
		// TODO Auto-generated method stub
		return log_information.getInformationBydes(description);
	}

	@Override
	public List<com.example.entity.log_information> getInformationByPosition(String location) {
		// TODO Auto-generated method stub
		return log_information.getInformationByPosition(location);
	}

	@Override
	public List<com.example.entity.log_information> getInformationByTime(String time1, String time2) {
		// TODO Auto-generated method stub
		return log_information.getInformationByTime(time1, time2);
	}

	@Override
	public void insertInformation(String log_id, String information_id, String time, String location,
			String description) {
		// TODO Auto-generated method stub
		log_information.insertInformation(log_id, information_id, time, location, description);
	}

	@Override
	public void delectInformation(String log_id) {
		// TODO Auto-generated method stub
		log_information.delectInformation(log_id);
	}


}
