/**
 * 1. Java会默认导入java.lang包下所有的类，因此这些类我们可以直接使用。
　　 2. 如果导入两个同名的类，只能用包名+类名来显示调用相关类：　
 */
package com.domo.OOP;

import java.util.Date;
import com.domo.ProcessControl.*;//导入该包下所有的类。会降低编译速度，但不会降低运行速度。
import static java.lang.Math.*;//导入Math类的所有静态属性
import static java.lang.Math.PI;//导入Math类的PI属性
/**
   * 项目名称：domo
   *类名称：PackageAndImport
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月3日下午10:42:02
   * 类描述:package和import导包以及静态导入
   * 
 */
public class PackageAndImport {
	public static void main(String[] args) {
		Date date = new Date();
	 //调用本包下的类不需要import导入
	 Construct construct =new Construct(1.1, 1.2);
	 System.out.println(construct.getDistance(construct)); 
	 //调用不同包下的类需要import导入
	 Nestedloop.main(args);
	 
	 //静态导入JDK1.5之后的特性
	 double a = PI*11;  //这里PI是java.lang.Math下的静态属性
	}
	
}
