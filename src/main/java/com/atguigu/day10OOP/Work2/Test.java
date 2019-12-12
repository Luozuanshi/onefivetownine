/**
 * 
 */
package com.atguigu.day10OOP.Work2;

/**
   * 项目名称：domo
   *类名称：Test
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午7:03:50
   * 类描述
 */
public class Test {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.setAge(50);
		professor.setName("张三");
		professor.setPost("大学教授");
		professor.setSalary(50000);
		
		System.out.println(professor.introduce());
		
		AssociateProfessor associateProfessor = new AssociateProfessor();
		associateProfessor.setAge(40);
		associateProfessor.setName("里斯");
		associateProfessor.setPost("大学副教授");
		associateProfessor.setSalary(50000);
		
		System.out.println(associateProfessor.introduce());
		
		Lecturer lecturer = new Lecturer();
		lecturer.setAge(30);
		lecturer.setName("王五");
		lecturer.setPost("讲师");
		
		System.out.println(lecturer.introduce());
		
		System.out.println("*************************");
		System.out.println(professor.introduce());
		System.out.println(associateProfessor.introduce());
		System.out.println(lecturer.introduce());
		
		Teacher teacher = new Teacher();
		teacher.setAge(30);
		teacher.setName("111111");
		teacher.setPost("22222");
		
		System.out.println(teacher);
		
	}
}
