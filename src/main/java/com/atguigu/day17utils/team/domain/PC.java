package com.atguigu.day17utils.team.domain;

public class PC implements Equipment {

	/**
	 * model: String display: String
	 * 
	 */
	private String model;
	private String display;

	public PC(String model, String display) {
		super();
		this.model = model;
		this.display = display;
	}

	/**
	 * 获取设备的详细信息
	 */
	@Override
	public String getDescription() {
		return display + "(" + model + ")";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

}
