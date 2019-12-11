/**
 * 
 */
package com.atguigu.day10OOP.Work2;

/**
   * 项目名称：domo
   *类名称：Lecturer
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月11日下午7:12:07
   * 类描述	四、、编写老师类
（1）要求有属性“姓名name”，“年龄age”，“职称post”，“基本工资salary”（10分）
（2）设置4个静态常量：“部门department”值为“baway”，“工资级别levela ,levelb,levelc”初始值分别为1.1,1.2,1.3。（10分）
（3）编写业务方法， introduce（），实现输出一个教师的信息。（10分）
（4）：编写教师类的三个子类：教授类、副教授类、讲师类。工资级别分别为：教授为1.3、副教授为1.2、讲师类1.1。在三个子类里面都重写父类的introduce（）方法。
（5）定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印。（10分）
 */
public class Lecturer extends Teacher{
	public String introduce() {
		return toString() + "工资级别" + this.LEVALA;
	}
}
