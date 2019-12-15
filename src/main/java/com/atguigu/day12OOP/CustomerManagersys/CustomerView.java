/**
 * 
 */
package com.atguigu.day12OOP.CustomerManagersys;

import java.util.Scanner;

/**
   * 项目名称：domo
   *类名称：CustomerView
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月15日下午1:43:14
   * 类描述  业务操作视图类
 */
public class CustomerView {
	CustomerList customerList = new CustomerList();
	boolean loopFlag = true;
	Scanner in =new Scanner(System.in);
	char key;
	
	public void enterMainMenu() {
		do {
			System.out.println("-----------------家庭收支记账软件-----------------");
			System.out.println("\t\t\t 1 添 加 客 户");
			System.out.println("\t\t\t 2 修 改客 户");
			System.out.println("\t\t\t 3 删 除 客 户");
			System.out.println("\t\t\t 4 客 户 列 表");
			System.out.println("\t\t\t 5 退           出");
			System.out.print("\t\t请选择(1-4): ");
			key = in.next().charAt(0);

			switch (key) {
			case '1':
				System.out.println("---------------------添加客户---------------------");
				Customer cst = new Customer();
				System.out.print("ID：");
				cst.setId(in.nextInt());
				System.out.print("姓名：");
				cst.setName(in.next());
				System.out.print("性别：");
				cst.setGender(in.next().charAt(0));
				System.out.print("年龄：");
				cst.setAge(in.nextInt());
				System.out.print("电话：");
				cst.setPhone(in.next());
				System.out.print("邮箱：");
				cst.setEmail(in.next());
				addNewCustomer(cst);
				System.out.println("---------------------添加完成---------------------");
				break;
			case '2':
				System.out.println("---------------------修改客户---------------------");
				System.out.println("请选择待修改客户编号(-1退出)：");
				int index = in.nextInt();
				if(index==-1) {
					break;
				}
				Customer cst1 = new Customer();
				System.out.print("ID：");
				String id =in.next();
				System.out.print("姓名：");
				String name =in.next();
				System.out.print("性别：");
				String gender =in.next();
				System.out.print("年龄：");
				String age =in.next();
				System.out.print("电话：");
				String phone =in.next();
				System.out.print("邮箱：");
				String email =in.next();
				modifyCustomer(index, id,name,gender,age,phone,email);
				System.out.println("---------------------修改完成---------------------");
				break;
			case '3':
				System.out.println("---------------------删除客户---------------------");
				System.out.println("请选择待删除客户编号(-1退出)：1");
				index = in.nextInt();
				if(index==-1) {
					break;
				}
				deleteCustomer(index);
				System.out.println("确认是否删除(Y/N)：y");
				
				System.out.println("---------------------删除完成---------------------");
				

				break;
			case '4':
				System.out.println("---------------------------客户列表---------------------------");
				System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱");
				listAllCustomers();
				System.out.println("-------------------------客户列表完成-------------------------");
				break;
			case '5':
				exit();
				break;

			default:
				break;
			}
		}while(loopFlag);
		
		
		
	}
	private void addNewCustomer(Customer cst) {
		customerList.addCustomer(cst);	
	}
	private void modifyCustomer(int index,String... args) {
		customerList.replaceCustomer(index, args);
	}
	private void deleteCustomer(int index) {
		customerList.delteCustomer(index);
	}
	private void listAllCustomers() {
		//避免数组越界
		for (int i = 0; i < customerList.getCustomerList().length; i++) {
			customerList.getCustomer(i);
			System.out.println();
		}
		
	}
	
	public void exit() {
		while(true) {
			System.out.println("你确定要退出吗? y/n");
			char choice= in.next().toLowerCase().charAt(0);
			if(choice == 'y'){
				loopFlag =false;
				break;
			}else if(choice =='n') {
				loopFlag =true;
				break;
			}
				
		}
	}
	
	public static void main(String[] args) {

	}

}
