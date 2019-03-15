
package com.domo.OOP.advance;

/**
   * 项目名称：domo
   *类名称：ObjectClass
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月15日下午4:12:15
   * 类描述:父类重写toString方法
 */
public class ObjectClass {
	public static void main(String[] args) {
		ObjectClass objectClass = new ObjectClass();
		System.out.println(objectClass);
		
		person2 person2 =new person2("胖罗",18);
		System.out.println(person2);
	}
	
	//复写object toString方法
	public String toString() {
		return "11";
	}
	
}

class person2{
	String name;
	int age;
	
	//复写object toString方法
	public String toString() {
		return "姓名"+name+"年龄"+age;
	}
	
	//构造器不需要返回值
	public person2(String name,int age) {
		this.name=name;
		this.age=age;
	}
}