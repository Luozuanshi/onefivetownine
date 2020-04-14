package com.atguigu.day19Array.java;

import org.junit.Test;


/**
 	String,StringBuffer,StringBuilder三者之间的效率测试
 	
 	StringBuilder > StringBuffer > String
 *
 */
public class StringTime {

	@Test
	public void test() {
		long startTime = 0L;
		long endTime = 0L;
		
		String text = "";
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		
		// 开始对比
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			buffer.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer的执行时间：" + (endTime - startTime));
		
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			builder.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
		
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			text = text + i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("String的执行时间：" + (endTime - startTime));

	}
}
