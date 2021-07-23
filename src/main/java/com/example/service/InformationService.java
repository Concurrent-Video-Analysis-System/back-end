/**
 * 
 */
package com.example.service;

import java.util.List;

import com.example.entity.Information;

/**
 * @author 
 *
 */
public interface InformationService {

	List<Information> getAllInformation();
	
	List<Information> getInformationByOutlet(String outlet);
	
	List<Information> getInformationByIfhandle(boolean ifhandle);
	
	void delectInformationById(String information_id);
	
	int Insertformation(String information_id,String outlet,String image_data,String classes,String class_name,String predict_data,boolean ifhandle);
	
	void HandleInformation(String information_id);
}
