/**
 * 
 */
package com.atguigu.day16EnumTrycatch.example;

/**
   * 项目名称：domo
   *类名称：seaEnum
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月20日上午9:36:26
   * 类描述 枚举类
 */
public class SeasonEnum {
	public static void main(String[] args) {
		System.out.println(Season.SPRING.getSEASONNAME()+Season.SPRING.getSEASONDES());
		System.out.println(Season.SUMMER.getSEASONNAME()+Season.SUMMER.getSEASONDES());
		System.out.println(Season.AUTUMN.getSEASONNAME()+Season.AUTUMN.getSEASONDES());
		System.out.println(Season.WINTER.getSEASONNAME()+Season.WINTER.getSEASONDES());
	}
}

//自定义的枚举类
class Season {
	private final String SEASONNAME;
	private final String SEASONDES;
	
	public Season(String sEASONNAME, String sEASONDES) {
		super();
		SEASONNAME = sEASONNAME;
		SEASONDES = sEASONDES;
	}
	
	public static final Season SPRING = new Season("春天", "111111");
	public static final Season SUMMER = new Season("夏天", "222222");
	public static final Season AUTUMN = new Season("秋天", "333333");
	public static final Season WINTER = new Season("冬天", "444444");
	
	
	public String getSEASONNAME() {
		return SEASONNAME;
	}
	public String getSEASONDES() {
		return SEASONDES;
	}
	
	
}
