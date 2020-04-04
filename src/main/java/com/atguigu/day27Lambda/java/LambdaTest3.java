package com.atguigu.day27Lambda.java;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * Lambda六种格式
 * 
 *
 */
public class LambdaTest3 {
	/*
	 * 语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
	 */
	@Test
	public void test6(){
		//创建匿名内部类的对象
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		//----------lambda-------------------
		
		//类型推断 
		//注意 ： 1.如果有多个形参小括号不能省略   2.如果有多条执行语句大括号不能省略
		Comparator<String> c2 =(o1,o2) -> o1.compareTo(o2);
	}
	
	/*
	 * 语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
	 */
	@Test
	public void test5(){
		//创建匿名内部类的对象
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("ccccccccccccc");
				return o1.compareTo(o2);
			}
		};
		
		//----------lambda-------------------
		
		//类型推断
		Comparator<String> c2 =(o1,o2) -> {
			System.out.println("ccccccccccccc");
			return o1.compareTo(o2);
		};
	}
	
	/*
	 * 语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
	 */
	@Test
	public void test4(){
		//创建匿名内部类的对象
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		//----------lambda-------------------
		
		//类型推断
		Consumer<String> c2 = t->{
			System.out.println(t);
		};
	}
	
	/*
	 * 语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
	 */
	@Test
	public void test3(){
		//创建匿名内部类的对象
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		//----------lambda-------------------
		
		//类型推断
		Consumer<String> c2 =(t)->{
			System.out.println(t);
		};
	}
	
	/*
	 * 语法格式二：Lambda 需要一个参数，但是没有返回值。
	 */
	@Test
	public void test2(){
		//创建匿名内部类的对象
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		//----------lambda-------------------
		
		Consumer<String> c2 =(String t)->{
			System.out.println(t);
		};
	}

	/*
	 * 语法格式一：无参，无返回值
	 */
	@Test
	public void test(){
		//创建匿名内部类的对象
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("cccccccccccccc");
			}
		};
		
		//----------lambda-------------------
		
		Runnable r2 = () -> {
			System.out.println("ccc");
		};
	}
	
}



















