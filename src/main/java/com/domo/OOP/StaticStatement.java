/**
 * 
 */
package com.domo.OOP;

/**
   * 项目名称：domo
   *类名称：StaticStatement
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月2日下午5:04:30
   * 类描述
 */
public class StaticStatement {
    int id; // id
    String name; // 账户名
    String pwd; // 密码
     
    static String company = "北京尚学堂"; // 公司名称
     
     
    public StaticStatement(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    public void login() {
        printCompany();//静态方法静态变量本类中不需要加类名
        System.out.println(company); //company本类中静态成员变量
        System.out.println("登录：" + name);
    }
     
    public static void printCompany() {
//         login();//静态方法里调用非静态方法，编译就会报错
        System.out.println(company);
    }
     
    public static void main(String[] args) {
        StaticStatement u = new StaticStatement(101, "高小七");
        //静态方法静态变量本类中不需要加类名
        printCompany();
        company = "北京阿里爷爷";
        printCompany();
        //类信息中显示声明了构造方法,当使用无参数构造方法的时候也需要显示声明
        StaticStatement statement=new StaticStatement(10, "pangluo");
        		statement.login();
    }

}
