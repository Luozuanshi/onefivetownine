package com.atguigu.day20List.java3;

public class Dog implements Comparable {

	String name;
	int age;
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	/***
	 * 重写toString方法的原因是为了输出该类的对象时输出的是对象中的内容。
	 * 
	 * Dog dog = new Dog();
	 * System.out.println(dog); //其实调用的是dog.toString()
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		//先判断类型
		if(o instanceof Dog){
			//向下转型
			Dog d = (Dog) o;
			//安照年纪排序
//			return this.age - d.age;//升序
//			return -(this.age - d.age);//降序
			
			//安照名字排序
//			return this.name.compareTo(d.name);
			
			//如果名字相同安照年纪排
			int compareTo = this.name.compareTo(d.name);
			if(compareTo == 0){//表示名字一样
				//安年纪排
				return this.age - d.age;
			}
			return compareTo;
		}
		
		return 0;//0表示两个对象是相同的。
	}
	
	
}
