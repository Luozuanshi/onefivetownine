package com.atguigu.day17utils.team.service.test;

import com.atguigu.day17utils.team.domain.Employee;
import com.atguigu.day17utils.team.domain.Programmer;
import com.atguigu.day17utils.team.service.NameListService;
import org.junit.Test;

public class NameListServiceTest {

	@Test
	public void getAllEmployeesTest(){
		
		NameListService nameListService = new NameListService();
		
		Employee[] allEmployees = nameListService.getAllEmployees();
		
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println(allEmployees[i].getName());
		}
	}
	
	@Test
	public void getEquipmentsTest(){
		
		NameListService nameListService = new NameListService();
		
		Employee[] allEmployees = nameListService.getAllEmployees();
		
		for (int i = 0; i < allEmployees.length; i++) {
			//多态
			Employee employee = allEmployees[i];
			
			if(employee instanceof Programmer){
				//向下转型
				Programmer p = (Programmer) employee;
				//调用方法
				System.out.println(p.getEquipment().getDescription());
			}
		}
	}
}

















