package com.atguigu.day19Array.exer;

import org.junit.Test;

/**
 * 
 * 2.将"AaBcDeFg"中小写字母转成大写 （charAt(int index)）
 * 3.将"AaBcDeFg"大写变小写，小写变大写
 * 
 * 5.统计"abcdabcdddabc"中abc出现的次数。
 */
public class StringTest3 {
	
	//统计"abcdabcdddabc"中abc出现的次数。
	@Test
	public void test3(){
		String str = "abcdabcdddabcabcabcabc";
		
		String findStr = "abc";//要查找内容
		int count = 0; //出现的次数
		int index = 0;//开始查找的索引位置
		
		/*
		 * public int indexOf(String str, int fromIndex)
		 * str : 要查找的内容
		 * fromIndex : 从当前字符串中的fromIndex的索引位置开始查找
		 * 返回值 ： str首次出现的位置。如果找不到返回-1
		 */
		while((index = str.indexOf(findStr,index)) != -1){
			count++;
			index += findStr.length();//下次要开始查找的索引位置
		}
		
		System.out.println(count);
	}
	
	//4.将"abcdefg"中的内容进行反转。
	@Test
	public void test2(){
		//第一种方式 ： 将字符串转成数组，然后再反转
		//第二种方式 ：从后向前获取每一个字符，字符串拼接
		String newStr = "";
		String str = "abcdefg";
		for(int i = str.length() - 1; i >= 0; i--){
			//获取每一个字符
			char c = str.charAt(i);
			newStr += c;
		}
		System.out.println(newStr);
	}

	//1.将"AaBcDeFg"中大写字母转成小写 （charAt(int index)）
	@Test
	public void test(){
		String s = "AaBcDeFg";
		String newStr = "";
		//遍历所有的字符
		for (int i = 0; i < s.length(); i++) {
			//获取每一个字符
			char c = s.charAt(i);
			//判断是否为大写
			if(c >= 'A' && c <= 'Z'){
				//大写转小写
				c += 32;
			}
			//字符串拼接
			newStr += c;
		}
		System.out.println(newStr);
	}
}

















