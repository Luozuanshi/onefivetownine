/**
 * 
 */
package com.domo.ProcessControl;

/**
   * 项目名称：domo
   *类名称：MethodDefinition
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月1日下午11:34:42
   * 类描述:方法的定义_形参_实参_返回值_语句块
 */
public class MethodDefinition {

	public static void main(String[] args) {
	   //语句块
		int n;
        int a;
        {
            int k;
//            int n; //编译错误：不能重复定义变量n
        } //变量k的作用域到此为止
        
        MethodDefinition methodDefinition =new MethodDefinition();
        //实例调用本类方法
        methodDefinition.printDOMO();
       //实例调用本类具有返回值的方法 
       int sum =methodDefinition.sum(20, 20);//sum(20, 20) 20,20实际参数
	}
	
	/**
	 * 打印输出提示
	 */
	void printDOMO() {
		System.out.println("hello DOMO");
	}
	
	/**
	 * 求和的方法
	 * @param a 形式参数
	 * @param b 形式参数
	 * @return
	 */
	int sum(int a, int b) {
		System.out.println();
		return a+b;
	}

}
