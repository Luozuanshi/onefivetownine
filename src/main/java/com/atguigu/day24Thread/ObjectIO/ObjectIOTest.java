package src.main.java.com.atguigu.day24Thread.ObjectIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/*
 * 对象流
 */
public class ObjectIOTest {

	/**
	 * 把内存Person对象持久化写出文件
	 * @throws Exception
	 */
	@Test
	public void write() throws Exception{
		FileOutputStream fos = new FileOutputStream("aaa.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Person p = new Person("ccc", 18,new Address(100, "草围","110"));
		oos.writeObject(p);
		
		oos.close();
	}
	
	/**
	 * 读取二进制文件内容转化成内存Person对象
	 * @throws Exception
	 */
	@Test
	public void read() throws Exception{
		FileInputStream fis = new FileInputStream("aaa.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p = (Person) ois.readObject();
		System.out.println(p);
	}
}








