/**
 * 
 */
package com.atguigu.day16Enum.example;

/**
 * 	
   * 项目名称：domo
   *类名称：EnumTest
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月22日下午10:48:41
   * 类描述 :	
   * 4 使用枚举类实现接口中的方法
 */
interface description{
	void des();
}

public class EnumTest3 {
	public static void main(String[] args) {
		Season4.SPRING.des();
		Season4.SUMMER.des();
		Season4.AUTUMN.des();
		Season4.WINTER.des();
	}
}

enum Season4 implements description{
	SPRING("春天"){
		@Override
		public void des() {
			System.out.println("枚举类春天对象实现接口中的抽象方法"+this.getSEASONNAME());
			
		}
	},SUMMER("夏天"){
		@Override
		public void des() {
			System.out.println("枚举类夏天对象实现接口中的抽象方法"+this.getSEASONNAME());
		}
	},AUTUMN("秋天"){
		@Override
		public void des() {
			System.out.println("枚举类秋天对象实现接口中的抽象方法"+this.getSEASONNAME());
		}
	},WINTER("冬天"){
		@Override
		public void des() {
			System.out.println("枚举类春天对象实现接口中的抽象方法"+this.getSEASONNAME());
			
		}
	};
	private String SEASONNAME;
	Season4(String name){
		SEASONNAME = name;
	}
	
	public String getSEASONNAME() {
		return SEASONNAME;
	}

	
}
	
	
