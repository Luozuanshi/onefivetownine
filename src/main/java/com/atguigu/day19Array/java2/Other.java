package com.atguigu.day19Array.java2;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Other {
	
	/**
	 * 一般的Float类和Double类可以用来做科学计算或工程计算，但在商业计算中，要求数字精度比较高，故用到java.math.BigDecimal类。

	 */
	@Test
	public void test3(){
		System.out.println(1 - 0.41);
		BigDecimal a = new BigDecimal(String.valueOf(1));
		BigDecimal b = new BigDecimal(String.valueOf(0.41));
		BigDecimal subtract = a.subtract(b);
		System.out.println(subtract);
	}
	
	/**
	 * java.math包的BigInteger可以表示不可变的任意精度的整数。BigInteger 提供所有 Java 的基本整数操作符的对应物，并提供 java.lang.Math 的所有相关方法。另外，BigInteger 还提供以下运算：模算术、GCD 计算、质数测试、素数生成、位操作以及一些其他操作。 

	 */
	@Test
	public void test2(){
		int sum = Integer.MAX_VALUE + 1;
		System.out.println(sum);
		
		//---------------------------------------------------------------
		
		BigInteger a = new BigInteger(String.valueOf(Integer.MAX_VALUE));
		BigInteger b = new BigInteger(String.valueOf(1));
		BigInteger add = a.add(b);
		System.out.println(add);
	}

	/**
	 * java.lang.Math提供了一系列静态方法用于科学计算。其方法的参数和返回值类型一般为double型
	 */
	@Test
	public void test(){
		System.out.println(Math.max(12.3, 12.5));
		System.out.println(Math.abs(-5));
	}
	
	
}
