/**
 * 
 */
package com.atguigu.day12OOP.CustomerManagersys;

/**
 * 项目名称：domo 类名称：CustomerList
 * 
 * @author Administrator
 * @version 1.0 创建时间2019年12月15日上午11:27:28 类描述
 *	对customer对象以对象数组的形式管理
 */
public class CustomerList {
	private Customer[] customerList;

	// 增加客户
	public void addCustomer(Customer cst) {
		if (customerList == null) {
			Customer[] customerListTemp = new Customer[1];
			
			// 对象赋值
			customerListTemp[customerListTemp.length - 1] = cst;
			customerList = customerListTemp;
		} else {
			Customer[] customerListTemp = new Customer[customerList.length + 1];
			// 拷贝数组
			for (int i = 0; i < customerList.length; i++) {
				customerListTemp[i] = customerList[i];
			}

			// 对象赋值
			customerListTemp[customerListTemp.length - 1] = cst;
			customerList = customerListTemp;
		}

	}

	// 修改客户
	public void replaceCustomer(int index, String... args) {
		//只在数组范围内修改，大于数组范围不满足index==i的条件则不会修改。防止数组越界
		for (int i = 0; i < customerList.length; i++) {
			if (index == i) {
				customerList[i].setId(Integer.parseInt(args[0]));
				customerList[i].setName(args[1]);
				customerList[i].setGender(args[2].charAt(0));
				customerList[i].setAge(Integer.parseInt(args[3]));
				customerList[i].setPhone(args[4]);
				customerList[i].setEmail(args[5]);
			}
		}

	}

	// 删除客户
	public void delteCustomer(int index) {
		//
		if(customerList == null) {
			System.out.println("一开始没有客户````````````");
		}else {
			
			if(index>=customerList.length) {
				System.out.println("没有"+index+"号客户");
				return;
			}else {
				Customer[] customerListTemp = new Customer[customerList.length];
				
				// 拷贝原数组
				for (int i = 0; i < customerListTemp.length; i++) {
					customerListTemp[i] = customerList[i];
				}
				// 覆盖指定位置的数组,后面的数组往前面指定移动一位
				
				for (int i = index; i < customerList.length - 1; i++) {
					customerListTemp[i] = customerList[i + 1];
				}

				Customer[] customerListNew = new Customer[customerListTemp.length - 1];
				// 创建新数组阶段数组长度
				for (int i = 0; i < customerListNew.length; i++) {
					customerListNew[i] = customerListTemp[i];
				}
				// 创建新数组阶段数组长度
				customerList = customerListNew;
			}
				}
}
			
	// 获取所有客户
	public void getAllCustomer() {
		System.out.println("*********************************");
		for (int i = 0; i < customerList.length; i++) {
			System.out.println(customerList[i]);
		}
	}

	// 获取指定客户
	public void getCustomer(int index) {
		System.out.print(customerList[index].getId() + "\t");
		System.out.print(customerList[index].getName() + "\t");
		System.out.print(customerList[index].getGender() + "\t");
		System.out.print(customerList[index].getAge() + "\t");
		System.out.print(customerList[index].getPhone() + "\t");
		System.out.print(customerList[index].getEmail() + "\t");
	}

	
	//getter setter
	public Customer[] getCustomerList() {
		return customerList;
	}

	public void setCustomerList(Customer[] customerList) {
		this.customerList = customerList;
	}

	public static void main(String[] args) {
		CustomerList CustomerList = new CustomerList();
		CustomerList.customerList = new Customer[2];
		CustomerList.customerList[0] = new Customer(1, "张三", '男', 20, "15616211235", "845597315@qq.com");
		CustomerList.customerList[1] = new Customer(2, "李四", '男', 20, "15616211234", "845597315@qq.com");
		CustomerList.getAllCustomer();

		// 增加客户
		CustomerList.addCustomer(new Customer(3, "王五", '女', 20, "15616211234", "123@qq.com"));
		CustomerList.getAllCustomer();

		// 修改客户
		CustomerList.replaceCustomer(0, "1", "jack", "男", "50", "15616216666", "46@qq.com");

		CustomerList.getAllCustomer();
		// 删除客户
		CustomerList.delteCustomer(1);

		CustomerList.getAllCustomer();
		// 获取指定客户
		CustomerList.getCustomer(1);

		CustomerList CustomerList1 = new CustomerList();
		CustomerList1.customerList = new Customer[2];
		CustomerList1.customerList[0] = new Customer(1, "张三", '男', 20, "15616211235", "845597315@qq.com");
		CustomerList1.customerList[1] = new Customer(2, "李四", '男', 20, "15616211234", "845597315@qq.com");
		CustomerList1.getAllCustomer();

		// 增加客户
		CustomerList1.addCustomer(new Customer(3, "王五", '女', 20, "15616211234", "123@qq.com"));
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
