package com.atguigu.day27Lambda.java3;

import com.atguigu.day27Lambda.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 	Stream到底是什么呢？
			是数据渠道，用于操作数据源（集合、数组等）所生成的元素序列。“集合讲的是数据，Stream讲的是计算！”

	注意：
		①Stream 自己不会存储元素。
		②Stream 不会改变源对象。相反，他们会返回一个持有结果的新Stream。
		③Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行。

	一 创建 Stream
 */
public class StreamTest {
	static ArrayList<Employee> list = new ArrayList<>();
	
	static{
		list.add(new Employee("aaa", 18, 2000));
		list.add(new Employee("ccc", 20, 5000));
		list.add(new Employee("ddd", 25, 6000));
		list.add(new Employee("fff", 30, 8000));
		list.add(new Employee("bbb", 35, 3000));
	}
	@Test
	public void test(){
		String[] names = {"aa","cc","dd"};
		//Java8 中的 Arrays 的静态方法 stream() 可以获取数组流
		Stream<String> stream = Arrays.stream(names);
		//将集合转成流 : 调用stream()方法
		Stream<Employee> stream2 = list.stream();
		//创建 Stream方式三：通过Stream的of()
		Stream<Integer> stream3 = Stream.of(1,2,3,4,5);
	}
	
	/*
	 * 创建 Stream方式四：创建无限流
	 * 可以使用静态方法 Stream.iterate() 和 Stream.generate(), 创建无限流。
	 */
	@Test
	public void test3(){
//		Stream.generate(new Supplier<Double>() {
//
//			@Override
//			public Double get() {
//				
//				return Math.random();
//			}
//		}).forEach(new Consumer<Double>() {
//
//			@Override
//			public void accept(Double t) {
//				System.out.println(t);
//			}
//		});
		
		Stream.generate(Math :: random).forEach(System.out::println);
	}
	@Test
	public void test2(){
//		Stream.iterate(1, new UnaryOperator<Integer>() {
//
//			@Override
//			public Integer apply(Integer t) {
//				
//				return t + 1;
//			}
//		})
//		.limit(10)
//		.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		});
		
		System.out.println("----------------------------------------------");
//		Stream.iterate(1, t -> t + 1).limit(10).forEach(t -> System.out.println(t));
		Stream.iterate(1, t -> t + 1).limit(10).forEach(System.out::println);
	}
}






































