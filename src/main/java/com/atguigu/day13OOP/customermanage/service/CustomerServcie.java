package src.main.java.com.atguigu.day13OOP.customermanage.service;

import src.main.java.com.atguigu.day13OOP.customermanage.domain.Customer;

public class CustomerServcie {

	//属性
	private Customer[] customers;  //笨方法,100=> 动态数组[集合]
	private int customersNum = 1;
	private int idSeed = 1; //id自增的种子
	
	public CustomerServcie(int size) {
		customers = new Customer[size];
		//手动增加一个客户，为了做测试
		customers[0] = new Customer(1, "tom", '男', (short)18, "112", "tom@sohu.com");
		
	}
	
	//返回当前客户数组
	public Customer[] showList() {
		//第一个方式
		
		//1. 把有效的customer 放入到一个新的数组中，然后返回
		Customer[] showCustomers = new Customer[customersNum];
		for(int i = 0; i < customersNum; i++) {
			showCustomers[i] = customers[i];
		}
		
		return showCustomers;
		
		//第2个方式
	}
	
	//添加客户
	public boolean addCustomer(String name,char gender,short age,String tel, String email){
		
		//构建一个Customer
		
		Customer customer = new Customer(name, gender, age, tel, email);
		customer.setId(++idSeed);
		customers[customersNum++] = customer;
		
		return true;
		
		
	}
	
	
	public boolean delCustomerById(int id) {
		
		int index = findCustomerById(id);
		if(index == -1) {
			return false;
		}
		
		if(customersNum==0) {
			return false;
		}
		//将index + 1这个 客户后面的所有客户向前移动
		for(int i = index+1; i < customersNum; i++) {
			customers[i-1] = customers[i];
		}
		customersNum--;
		return true;
	}
	
	
	public void modifyCustomer(int d) {
		
	}
	//通过返回值，判断要删除的customer是否存在
	public int findCustomerById(int id) {
		
		int index = -1; //下标
		
		//遍历数组
		for (int i = 0; i < customers.length; i++) {
			if(customers[i]==null) {
				continue;
			}else if(customers[i].getId() == id) {
				index = i; 
				break;
			}
			
		}
		return index;
	}
	
}
