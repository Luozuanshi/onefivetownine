package com.atguigu.day17utils.team.domain;

public class Employee {

	/*
	 * - id: int name:String age: int salary: double
	 * 
	 */
	private int id; //员工id
	private String name;//名字
	private int age;//年纪
	private double salary;//薪水

	public Employee() {
		super();
	}

	/**
	 * 即然有了构造器为什么还需要set/get方法？
	 * 因为一个对象中的构造器只能调用一次。
	 * @param id
	 * @param name
	 * @param age
	 * @param salary
	 */
	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
