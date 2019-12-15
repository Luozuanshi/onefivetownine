/**
 * 
 */
package com.atguigu.day12OOP.CustomerManagersys;

/**
   * 项目名称：domo
   *类名称：Customer
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月14日下午7:19:45
   * 类描述
   * javaBean Customer对象
 */
public class Customer {
	private int id;
	private String name;
	private char gender;
	private int age;
	private String phone;
	private String email;
	
	public Customer() {
		super();
	}
	
	public Customer(int id, String name, char gender, int age, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


	public void showMunu() {
		System.out.println("-----------------客户信息管理软件-----------------");
		System.out.println("		  1添 加 客 户");
		System.out.println("		  2修 改客 户");
		System.out.println("		  3删 除 客 户");
		System.out.println("		  4客 户 列 表");
		System.out.println("		  5退           出");

	}

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.showMunu();
		customer.setAge(50);
		customer.setEmail("123@qq.com");
		customer.setGender('男');
		customer.setId(500);
		customer.setName("张三");
		customer.setPhone("13187004444");
		System.out.println(customer);
	}
	
}

