/**
 * 日志信息实体类
 */
package com.example.entity;

public class log_information {

	private String log_id;
	private String information_id;
	private String time;
	private String description;
	public String getLog_id() {
		return log_id;
	}
	public void setLog_id(String log_id) {
		this.log_id = log_id;
	}
	public String getInformation_id() {
		return information_id;
	}
	public void setInformation_id(String information_id) {
		this.information_id = information_id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "log_information [log_id=" + log_id + ", information_id=" + information_id + ", time=" + time
				+ ", description=" + description + "]";
	}
	
}
