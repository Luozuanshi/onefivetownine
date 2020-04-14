package com.atguigu.day17utils.team.domain;

/**
 * 快捷键 ： ctrl + shift + f : 格式化代码
 * @author Administrator
 *
 */
public class NoteBook implements Equipment {

	/**
	 * model: String price: double
	 * 
	 */
	private String model;
	private double price;

	public NoteBook(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	/**
	 * 获取设备的详细信息
	 */
	@Override
	public String getDescription() {
		return model + "(" + price + ")";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
