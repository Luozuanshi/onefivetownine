package com.atguigu.day27Lambda.java2;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
	函数式接口：
	
	说明：
		1.接口中抽象方法只有一个，这样的接口叫作函数式接口
		2.可以使用注解@FunctionalInterface来验证接口是否是函数式接口
 */
public class FunctionalTest {
	
	@Test
	public void test4(){
		//断定型接口 ： 有参有返回值（boolean）
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return false;
			}
		};
	}
	
	@Test
	public void test3(){
		//函数型接口 : 有参有返回值
		Function<String, Integer> function = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	
	@Test
	public void test2(){
		//供给型接口 ： 无参有返回值
		Supplier<String> supplier = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	
	@Test
	public void test(){
		//消费型接口 : 有参无返回值
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		//-------------
		consumer = t -> System.out.println(t);
	}

}
@FunctionalInterface //作用 ： 用来验证该接口是否是函数式接口
interface MyInterface{
	void say();
}
