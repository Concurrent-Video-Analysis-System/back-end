/**
 * 
 */
package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.entity.Information;

@Mapper
public interface InformationDao {

	/**
	 * 
	 * @查询全部待处理信息
	 */
	@Select("SELECT * FROM information")
	List<Information> getAllInformation();
	
	/**
	 * 
	 * @param ifhandle
	 * @根据处理状态查询信息
	 */
	@Select("SELECT * FROM information WHERE ifhandle = #{ifhandle}")
	List<Information> getInformationByIfhandle(boolean ifhandle);
	
	/**
	 * 
	 * @param position
	 * @查询某个特定网点的全部信息
	 */
	@Select("SELECT * FROM information WHERE outlet = #{outlet}")
	List<Information> getInformationByOutlet(String outlet);
	
	/**
	 * 
	 * @param information_id
	 * @根据information_id删除一条信息
	 */
	@Delete("DELETE FROM information WHERE information_id = #{information_id}")
	void delectInformationById(String information_id);
	
	
	/**
	 * 
	 * @param information_id
	 * @param outlet
	 * @param position
	 * @插入信息
	 */
	@Insert("INSERT INTO information VALUES(#{information_id},#{outlet},#{image_data},#{classes},#{class_name},#{predict_data},#{ifhandle})")
	int Insertformation(String information_id,String outlet,String image_data,String classes,String class_name,String predict_data,boolean ifhandle);
	
	/**
	 * 
	 * @param information_id
	 * @处理某条信息，将处理标志位置为1
	 */
	@Update("UPDATE information SET ifhandle = 1 WHERE information_id = #{information_id}")
	void HandleInformation(String information_id);
}
