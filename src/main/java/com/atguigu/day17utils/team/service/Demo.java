package com.atguigu.day17utils.team.service;


class A{
	public void say(){
		System.out.println("AAAAA");
	}
}

class B extends A{
	public void say(){
		System.out.println("BBBBBB");
	}
}

class C extends B{
	public void say(){
		System.out.println("CCCCC");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		A a = new C();
		//多态
		B b = (B)a;
		
		b.say();
	}
}
