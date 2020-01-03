package src.main.java.com.atguigu.day24Thread.ThreadCreated;

/**
 * this的使用
 */
class Person {

	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void show() {
		//this表示当前对象。谁调用的show那么this就是谁
//		System.out.println(this.name);
		System.out.println(this);
	}
}

public class ThisTest {

	public static void main(String[] args) {

		Person p = new Person("aaa");
		Person p2 = new Person("ccc");
		System.out.println("p====" + p);//实际上调用的是toString方法，输出的是地址值
		p.show();
		System.out.println("p2====" + p2);//实际上调用的是toString方法，输出的是地址值
		p2.show();
	}
}
