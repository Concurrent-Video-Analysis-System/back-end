package com.example.service;

import java.util.List;
import com.example.entity.log_information;

public interface LogService {
	
    List<log_information> getInformation();
	
	log_information getInformationById(String log_id);
	

	List<log_information> getInformationByInformationId(String information_id);
	

	List<log_information> getInformationBydes(String description);
	

	List<log_information> getInformationByPosition(String location);
	

	List<log_information> getInformationByTime(String time1,String time2);
	

	void insertInformation(String log_id,String information_id,String time,String location,String description);
	

	void delectInformation(String log_id);
}
