/**
 * 待处理信息实体类
 */
package com.example.entity;

public class Information {

	private String information_id;
	private String outlet;
	private String image_data;
	private String classes;
	private String class_name;
	private String predict_data;
	private boolean ifhandle;
	public String getInformation_id() {
		return information_id;
	}
	public void setInformation_id(String information_id) {
		this.information_id = information_id;
	}
	public String getOutlet() {
		return outlet;
	}
	public void setOutlet(String outlet) {
		this.outlet = outlet;
	}
	public String getImage_data() {
		return image_data;
	}
	public void setImage_data(String image_data) {
		this.image_data = image_data;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getPredict_data() {
		return predict_data;
	}
	public void setPredict_data(String predice_data) {
		this.predict_data = predice_data;
	}
	public boolean isIfhandle() {
		return ifhandle;
	}
	public void setIfhandle(boolean ifhandle) {
		this.ifhandle = ifhandle;
	}
	@Override
	public String toString() {
		return "Information [information_id=" + information_id + ", outlet=" + outlet + ", image_data=" + image_data
				+ ", classes=" + classes + ", class_name=" + class_name + ", predict_data=" + predict_data
				+ ", ifhandle=" + ifhandle + "]";
	}

}
