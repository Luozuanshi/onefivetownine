/**
 * 
 */
package com.atguigu.day14OOP;

/**
   * 项目名称：domo
   *类名称：Test
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月19日下午4:07:46
   * 类描述
 */
public class Test {
	public static void main(String[] args) {
		String s = "guigu";
		
		Test test = new Test();
		test.show(s);
		System.out.println(s);
		
	}
	
	public void show(String s) {
//		s = "hello";
		System.out.println(s);
		s = "hello";
		System.out.println(s);

	}
}
