package com.atguigu.day17utils.team.domain;

public class Printer implements Equipment {

	/**
	 * type: String name: String
	 * 
	 */
	private String name;
	private String type;

	public Printer(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	/**
	 * 获取设备的详细信息
	 */
	@Override
	public String getDescription() {
		return name + "(" + type + ")";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
