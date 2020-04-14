package com.atguigu.day17utils.team.domain;

public class Programmer extends Employee {

	/*
	 * - memberId : int
 status: Status
 equipment: Equipment

	 */
	private int memberId; //TID - 团队id
	private Status status; //当前该员工的状态
	//声明的是一个设备的接口 （多态）- 对象的关联
	private Equipment equipment;//给equipment赋值的内容只能是该接口实现类的对象
	
	public Programmer() {
		super();
	}
	
	public Programmer(int id, String name, int age, double salary,Equipment equipment) {
		super(id, name, age, salary);//调用父类的有参构造器
		this.equipment = equipment;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
	
	
	
}
