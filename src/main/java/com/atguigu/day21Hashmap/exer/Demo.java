package com.atguigu.day21Hashmap.exer;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		Person p1 = new Person(1001,"AA");
		Person p2 = new Person(1002,"BB");

		set.add(p1);
		set.add(p2);
		
		p1.name = "CC";
		set.remove(p1);   //移除p1的时候，首先计算p1的hashcode(),决定存放的位置不一样，所以没有找到修改过后的p1，删除失败
		System.out.println(set);
		
		System.out.println("----------------------------------");
		
		set.add(new Person(1001,"CC"));//新增的对象new Person(1001,"CC"),hashCode运算的时候该位置没有存储值，所以新增成功
		System.out.println(set);
		
		System.out.println("----------------------------------");
		
		set.add(new Person(1001,"AA"));//新增的对象new Person(1001,"AA"),hashCode的时候与第一次添加的p1，位置一样，但是equals内容不一样，此时的p1为(1001,"CC")了，此时用单向链表的形式把新增的链接起来
		System.out.println(set);

	}
}
