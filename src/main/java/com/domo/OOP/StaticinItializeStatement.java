/**
 * 
 */
package com.domo.OOP;

/**
   * 项目名称：domo
   *类名称：staticinItializeStatement
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月2日下午5:21:23
   * 类描述：static 静态化初始化
 */
public class StaticinItializeStatement {

	 int id;        //id
	    String name;   //账户名
	    String pwd;   //密码
	    static String company; //公司名称
	    static {
	        System.out.println("执行类的初始化工作");
	        company = "北京尚学堂";
	        printCompany();
	    }  
	    public static void printCompany(){
	        System.out.println(company);
	    }  
	    public static void main(String[] args) {
	    	StaticinItializeStatement  u3 = new StaticinItializeStatement();
	    }

}
