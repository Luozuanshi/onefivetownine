package com.atguigu.day19Array.exer;

public class StringTest {

	String str = "good";
	char[] ch = { 't', 'e', 's', 't' };

	public void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'b';
	}

	public static void main(String[] args) {
		StringTest ex = new StringTest();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");//
		System.out.println(ex.ch);
	}

}
