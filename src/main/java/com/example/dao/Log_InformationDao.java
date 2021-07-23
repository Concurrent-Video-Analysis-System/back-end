package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.entity.log_information;

@Mapper
public interface Log_InformationDao {

	/**
	 * 
	 * @查询全部异常日志信息
	 */
	@Select("select * from log_information")
	List<log_information> getInformation();
	
	/**
	 * 
	 * @param log_id
	 * @根据日志编号查询某个日志信息
	 */
	@Select("select * from log_information where log_id = #{log_id}")
	log_information getInformationById(String log_id);
	
	/**
	 * 
	 * @param information_id
	 * @查询某个待处理信息对应的违规记录
	 */
	@Select("select * from log_information where information_id = #{information_id}")
	List<log_information> getInformationByInformationrId(String information_id);
	
	/**
	 * 
	 * @param description
	 * @查询某个特定违规行为的全部记录
	 */
	@Select("select * from log_information where description = #{description}")
	List<log_information> getInformationBydes(String description);
	
	/**
	 * 
	 * @param location
	 * @查询某个网点的全部违规记录
	 */
	@Select("select * from log_information where location = #{location}")
	List<log_information> getInformationByPosition(String location);
	
	/**
	 * 
	 * @param time1
	 * @param time2
	 * @查询两个时间之间的全部记录
	 */
	@Select("SELECT * FROM log_information WHERE time BETWEEN #{time1} AND #{time2}")
	List<log_information> getInformationByTime(String time1,String time2);
	
	/**
	 * 
	 * @param log_id
	 * @param video_id
	 * @param user_id
	 * @param starttime
	 * @param endtime
	 * @param description
	 * @插入新的日志信息
	 */
	@Insert("INSERT INTO log_information VALUES(#{log_id},#{information_id},#{time},#{location},#{description})")
	void insertInformation(String log_id,String information_id,String time,String location,String description);
	
	/**
	 * 
	 * @param log_id
	 * @删除某条信息
	 */
	@Delete("DELETE FROM log_information WHERE log_id = #{log_id}")
	void delectInformation(String log_id);
	
}
