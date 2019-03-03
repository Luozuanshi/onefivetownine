/**
 * 
 */
package com.domo.OOP;

/**
   * 项目名称：domo
   *类名称：TransferParameter
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月3日下午9:58:04
   * 类描述:JAVA的参数传值机制_值传递
   * · 基本数据类型参数的传值
　		　传递的是值的副本。 副本改变不会影响原件。
   	· 引用类型参数的传值
　	　传递的是值的副本。但是引用类型指的是“对象的地址”。因此，副本和原参数都指向了同一个“地址”，改变“副本指向地址对象的值，也意味着原参数指向对象的值也发生了改变”。
 */
public class TransferParameter {
	   int id;        //id
	    String name;   //账户名
	    String pwd;   //密码
	       
	    public TransferParameter(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	      
	    public   void   testParameterTransfer01(TransferParameter  u){
	    	u.id=3000;   //传进的对象引用地址值
	        u.name="高小八";
	    }
	     
	    public   void   testParameterTransfer02(TransferParameter  u){
	        u  =  new  TransferParameter(200,"高三");  //此时传进的U被赋予了新的对象地址
	        u.name ="我影响不到你";  //所以影响不到传进来的u1对象了
	    }
	      
	    public static void main(String[] args) {
	        TransferParameter   u1  =  new TransferParameter(100, "高小七");
	         
	        u1.testParameterTransfer01(u1); 
	        System.out.println(u1.id);
	 
	        u1.testParameterTransfer02(u1);
	        System.out.println(u1.name);
	    }
}
