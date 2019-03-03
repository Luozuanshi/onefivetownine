/**
 * 
 */
package com.domo.OOP.base;

/**
   * 项目名称：domo
   *类名称：ThisKeyWord
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月2日下午4:22:59
   * 类描述:this关键字
 */
public class ThisKeyWord {

	public static void main(String[] args) {
		
	}

}
 class User {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码
 
    public User() {
    }
    public User(int id, String name) {
        System.out.println("正在初始化已经创建好的对象："+this);
        this.id = id;   //不写this，无法区分局部变量id和成员变量id
        this.name = name;
    }
    public void login(){
        System.out.println(this.name+",要登录！");  //不写this效果一样
    }  
     
    public static void main(String[] args) {
        User  u3 = new User(101,"高小七");
        System.out.println("打印高小七对象："+u3);
        u3.login();
    }
}
 
 
 class TestThis {
	    int a, b, c;
	    String dString;
	 
	    TestThis() {
	        System.out.println("正要初始化一个Hello对象");
	    }
	    TestThis(int a, int b) {
	        // TestThis(); //这样是无法调用构造方法的！
	        this(); // 调用无参的构造方法，并且必须位于第一行！
	        a = a;// 这里都是指的局部变量而不是成员变量
	// 这样就区分了成员变量和局部变量. 这种情况占了this使用情况大多数！
	        this.a = a;
	        this.b = b;
	    }
	    TestThis(int a, int b, int c,String dString) {
	        this(a, b); // 调用带参的构造方法，并且必须位于第一行！
	        this.c = c;
	        this.dString=dString;
	    }
	 
	    void sing() {
	    	System.out.println(this.dString);
	    }
	    void eat() {
	        this.sing(); // 调用本类中的sing();
	        System.out.println("你妈妈喊你回家吃饭！");
	    }
	 
	    public static void main(String[] args) {
	        TestThis hi = new TestThis(2, 3);
	        TestThis hi1 = new TestThis(1, 2, 3, "东风破");
	        hi.eat();
	        hi1.eat();
	    }
	}