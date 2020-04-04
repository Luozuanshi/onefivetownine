/**
 * 
 */
package com.atguigu.day16EnumTrycatch.example;

/**
 * 	
   * 项目名称：domo
   *类名称：EnumTest
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月22日下午10:48:41
   * 类描述 :	2 使用自定义的枚举类
   * 3 枚举类中的常用的方法
 */
public class EnumTest2 {
	public static void main(String[] args) {
//		System.out.println(Season2.SPRING.getSeasonName());
		//values()去除枚举类中所有对象
		Season2[] s = Season2.values();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getSeasonName());
		}
		
		//valueOf(String name) 根据对象的名字获取对应的对象
		Season2 spring = Season2.valueOf("SPRING");//区分大小写
		System.out.println(spring.getSeasonName());
		
	}
}
//枚举类不能在继承其他类	
enum Season2{
	SPRING("春天"),SUMMER("夏天");
	//声明一个属性
	private final String SEASON_NAME;
	//创建构造器
    Season2(String seasonName) {
		this.SEASON_NAME = seasonName;
	}
	
	public String getSeasonName() {
		return SEASON_NAME;
	}
	
}
	
enum Season3{
	SPRING,SUMMER,AUTUMN,WINTER;
	Season3(){}//构造器默认就是私有的
}
	
	
	
