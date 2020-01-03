package src.main.java.com.atguigu.day25Thread.SynchronizeMethodLock;


class Person{
	
}

class Dog{
	
}
public class ClassTest {

	public static void main(String[] args) {
		
		Class clazz = Person.class;
		Class clazz2 = Person.class;
		
		Class clazz3 = new Person().getClass();//获取类信息
		
		System.out.println(clazz == clazz2);
		System.out.println(clazz == clazz3);
		
		
		Class c = Dog.class;
		System.out.println(clazz == c);
	}
}
