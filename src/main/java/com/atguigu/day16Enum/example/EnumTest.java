/**
 * 
 */
package com.atguigu.day16Enum.example;

/**
 * 	枚举类：一个类的对象的个数是可数多个的，这样的类叫做枚举类
   * 项目名称：domo
   *类名称：EnumTest
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月22日下午10:48:41
   * 类描述 :	1 自定义枚举类
 */
public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Season1.AUTUMN.getSEASOONNAME()+Season1.AUTUMN.getSEASOONDES());
		System.out.println(Season1.SPRING.getSEASOONNAME()+Season1.SPRING.getSEASOONDES());
		System.out.println(Season1.SUMMER.getSEASOONNAME()+Season1.SUMMER.getSEASOONDES());
		System.out.println(Season1.WINTER.getSEASOONNAME()+Season1.WINTER.getSEASOONDES());
	}
}

//自定义枚举类

class Season1 {
	private final String SEASOONNAME;
	private final String SEASOONDES;
	
	//私有化构造器
	public Season1(String sEASOONNAME, String sEASOONDES) {
		super();
		SEASOONNAME = sEASOONNAME;
		SEASOONDES = sEASOONDES;
	}
	//创建对象
	public final static Season1 SPRING = new Season1("春天","春眠不觉晓");
	public  final static Season1 SUMMER = new Season1("夏天","夏天蚊子咬");
	public final static Season1 AUTUMN = new Season1("秋天","秋天看资料");
	public final static Season1 WINTER = new Season1("冬天","冬天穿棉袄");

	//因为成员属性使用了final修饰，所以无法提供Setter修饰
	public String getSEASOONNAME() {
		return SEASOONNAME;
	}
	
	public String getSEASOONDES() {
		return SEASOONDES;
	}
	
	
	
	
	
	
}