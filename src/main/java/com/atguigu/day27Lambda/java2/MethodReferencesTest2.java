package com.atguigu.day27Lambda.java2;
import java.util.function.Function;

import org.junit.Test;

public class MethodReferencesTest2 {
	
	
	/**
	 * 数组的引用
	 */
	@Test
	public void test2(){
		
		Function<Integer, int[]> function = new Function<Integer, int[]>() {

			@Override
			public int[] apply(Integer t) {
				
				return new int[t];
			}
		};
		
		//----------------------------数组的引用------------------
		
		function = int[] :: new;
	}

	/**
	 * 构造器引用
	 */
	@Test
	public void test(){
		
		Function<Integer, Person> function = new Function<Integer, Person>() {

			@Override
			public Person apply(Integer t) {
				/**
				 * 注意 ： 1.方法的形参正好是构造器的实参   2.返回值的类型就是返回的创建的对象的类型。
				 */
				return new Person(t);
			}
		};
		
		//-----------------------------lambda-------------
		
		function = t -> new Person(t);
		
		//----------------------------构造器引用------------
		
		Function<Integer, Person> function2 = Person :: new;
		
		
		Person person = function2.apply(20);
		System.out.println(person);
		
		
	}
}
