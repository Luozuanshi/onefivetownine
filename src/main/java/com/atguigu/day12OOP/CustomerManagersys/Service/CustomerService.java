/**
 * 
 */
package com.atguigu.day12OOP.CustomerManagersys.Service;

import com.atguigu.day12OOP.CustomerManagersys.Bean.Customer;

/**
 * 项目名称：domo 类名称：CustomerList
 * 
 * @author Administrator
 * @version 1.0 创建时间2019年12月15日上午11:27:28 类描述 对customer对象以对象数组的形式管理
 */
public class CustomerService {
	private Customer[] customerList;
	private int idseed = 1;

	// 增加客户
	public boolean addCustomer(Customer cst) {
		if (onceRun()) {
			cst.setId(idseed++);
			Customer[] customerListTemp = new Customer[1];

			// 对象赋值
			customerListTemp[customerListTemp.length - 1] = cst;
			customerList = customerListTemp;
			return true;
		} else {
			cst.setId(idseed++);
			Customer[] customerListTemp = new Customer[customerList.length + 1];
			// 拷贝数组
			for (int i = 0; i < customerList.length; i++) {
				customerListTemp[i] = customerList[i];
			}

			// 对象赋值
			customerListTemp[customerListTemp.length - 1] = cst;
			customerList = customerListTemp;
			return true;
		}

	}

	// 修改客户
	public void replaceCustomer(int ID, String... args) {
		// 只在数组范围内修改，大于数组范围不满足index==i的条件则不会修改。防止数组越界
		for (int i = 0; i < customerList.length; i++) {
			if(ID == customerList[i].getId()) {
				customerList[i].setName(args[0]);
				customerList[i].setGender(args[1].charAt(0));
				customerList[i].setAge(Integer.parseInt(args[2]));
				customerList[i].setPhone(args[3]);
				customerList[i].setEmail(args[4]);
			}
			
		}

	}

	// 删除客户
	public boolean delteCustomer(int ID) {
		boolean exist =false;//
		
		if (onceRun()) {
			System.out.println("初始化的系统没有任何客户");
			return false;
		}

		for (int i = 0; i < customerList.length; i++) {
			if (ID == customerList[i].getId()) {

					Customer[] customerListTemp = new Customer[customerList.length];

					// 拷贝原数组
					for (int j = 0; j < customerListTemp.length; j++) {
						customerListTemp[j] = customerList[j];
					}
					// 覆盖指定位置的数组,后面的数组往前面指定移动一位

					for (int j = ID-1; j < customerListTemp.length - 1; j++) {
						customerListTemp[j] = customerList[j + 1];
					}

					Customer[] customerListNew = new Customer[customerListTemp.length - 1];
					// 创建新数组阶段数组长度
					for (int j = 0; j < customerListNew.length; j++) {
						customerListNew[j] = customerListTemp[j];
					}
					// 创建新数组阶段数组长度
					customerList = customerListNew;
					exist=true;
			}
			
		}
		if(!exist) {
			System.out.println("没有对应"+ID+"编号");
		}
			
			
		return true;
	}

	// 获取所有客户
	public void getAllCustomer() {
		System.out.println("*********************************");
		for (int i = 0; i < customerList.length; i++) {
			System.out.println(customerList[i]);
		}
	}

	// 获取指定客户
	public Customer getCustomer(int index) {

		return customerList[index];
	}

	// 判断是否是第一次运行
	public boolean onceRun() {
		if (customerList == null) {
			return true;
		} else {
			return false;
		}
	}

	// getter setter
	public Customer[] getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Customer[] customerList) {
		this.customerList = customerList;
	}

	public static void main(String[] args) {
		CustomerService CustomerService = new CustomerService();
		CustomerService.customerList = new Customer[2];
		CustomerService.customerList[0] = new Customer("张三", '男', 20, "15616211235", "845597315@qq.com");
		CustomerService.customerList[1] = new Customer("李四", '男', 20, "15616211234", "845597315@qq.com");
		CustomerService.getAllCustomer();

		// 增加客户
		CustomerService.addCustomer(new Customer("王五", '女', 20, "15616211234", "123@qq.com"));
		CustomerService.getAllCustomer();

		// 修改客户
		CustomerService.replaceCustomer(0, "1", "jack", "男", "50", "15616216666", "46@qq.com");

		CustomerService.getAllCustomer();
		// 删除客户
		CustomerService.delteCustomer(1);

		CustomerService.getAllCustomer();
		// 获取指定客户
		CustomerService.getCustomer(1);

		CustomerService CustomerList1 = new CustomerService();
		CustomerList1.customerList = new Customer[2];
		CustomerList1.customerList[0] = new Customer("张三", '男', 20, "15616211235", "845597315@qq.com");
		CustomerList1.customerList[1] = new Customer("李四", '男', 20, "15616211234", "845597315@qq.com");
		CustomerList1.getAllCustomer();

		// 增加客户
		CustomerList1.addCustomer(new Customer("王五", '女', 20, "15616211234", "123@qq.com"));
		CustomerList1.getAllCustomer();

		// 修改客户
		CustomerList1.replaceCustomer(0, "1", "jack", "男", "50", "15616216666", "46@qq.com");

		CustomerList1.getAllCustomer();
		// 删除客户
		CustomerList1.delteCustomer(1);

		CustomerList1.getAllCustomer();
		// 获取指定客户
		CustomerList1.getCustomer(1);

	}

}
