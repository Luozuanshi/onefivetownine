package com.atguigu.day17utils.team.service;

import com.atguigu.day17utils.team.domain.Architect;
import com.atguigu.day17utils.team.domain.Data;
import com.atguigu.day17utils.team.domain.Designer;
import com.atguigu.day17utils.team.domain.Employee;
import com.atguigu.day17utils.team.domain.Equipment;
import com.atguigu.day17utils.team.domain.NoteBook;
import com.atguigu.day17utils.team.domain.PC;
import com.atguigu.day17utils.team.domain.Printer;
import com.atguigu.day17utils.team.domain.Programmer;

/**
 * 用来管理公司所有的员工
 *
 */
public class NameListService {

	// 1.声明一个数组
	private Employee[] employees;

	/**
	 * 作用 ：用来封装对象，并将对象放入到数组中
	 */
	public NameListService() {
		// 初始化数组
		employees = new Employee[Data.EMPLOYEES.length];
		// 遍历数组
		for (int i = 0; i < Data.EMPLOYEES.length; i++) {
			// 通过员工的类型进行分类
			String type = Data.EMPLOYEES[i][0];
			// 获取数组中该员工的数据
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);

			switch (Integer.parseInt(type)) {
			case Data.EMPLOYEE:
				// 获取数组中的数据并封装成对象
				Employee employee = new Employee(id, name, age, salary);
				// 将对象放入到数组中
				employees[i] = employee;
				break;
			case Data.PROGRAMMER:
				// 封装对象
				Programmer programmer = new Programmer(id, name, age, salary, createEquipment(i));
				// 将对象添加到数组中
				employees[i] = programmer;
				break;
			case Data.DESIGNER:
				// 封装对象
				Designer designer = new Designer(id, name, age, salary, createEquipment(i),
						Double.parseDouble(Data.EMPLOYEES[i][5]));
				// 将对象放入到数组中
				employees[i] = designer;
				break;
			case Data.ARCHITECT:
				// 封装对象
				Architect architect = new Architect(id, name, age, salary, createEquipment(i),
						Double.parseDouble(Data.EMPLOYEES[i][5]), Integer.parseInt(Data.EMPLOYEES[i][6]));
				// 将对象放入到数组中
				employees[i] = architect;
				break;
			}
		}

	}

	/**
	 * 员工和设备的对应关系是靠索引值对应的
	 * 
	 * @param i
	 * @return
	 */
	private Equipment createEquipment(int i) {
		// 判断设备的类型
		switch (Integer.parseInt(Data.EQIPMENTS[i][0])) {
		case Data.PC:
			//封装
			return new PC(Data.EQIPMENTS[i][1], Data.EQIPMENTS[i][2]);
		case Data.NOTEBOOK:
			return new NoteBook(Data.EQIPMENTS[i][1], Double.parseDouble(Data.EQIPMENTS[i][2]));
		case Data.PRINTER:
			return new Printer(Data.EQIPMENTS[i][1], Data.EQIPMENTS[i][2]);
		}
		return null;
	}

	/**
	 * 获取所有的员工
	 */
	public Employee[] getAllEmployees() {
		return employees;
	}
	
	/**
	 * 	根据指定id获取对应的员工 
	 */
	public Employee getEmployee(int id) {
		
		
		return null;
		
	}
}
