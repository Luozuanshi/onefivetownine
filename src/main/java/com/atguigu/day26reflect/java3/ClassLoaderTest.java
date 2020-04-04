package com.atguigu.day26reflect.java3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

import org.junit.Test;

public class ClassLoaderTest {
	
	/**
	 * 读取配置文件内容
	 * @throws Exception 
	 */
	@Test
	public void test2() throws Exception{
		//创建Properties对象
		Properties properties = new Properties();
		//创建流的对象 - 默认的路径是当前工程下
//		FileInputStream fis = new FileInputStream("user.properties");
		//默认路径是当前工程的bin目录下
		InputStream is = this.getClass().getClassLoader()
				.getResourceAsStream("user.properties");
		//加载流
		properties.load(is);
		//获取内容
		String name = properties.getProperty("name");
		System.out.println(name);
		//关流
		is.close();
	}

	/**
	 * 获取类加载器
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception{
		//1.获取一个系统类加载器
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		System.out.println(classloader);
		
		//2.获取系统类加载器的父类加载器，即扩展类加载器
		classloader = classloader.getParent();
		System.out.println(classloader);
		
		//3.获取扩展类加载器的父类加载器，即引导类加载器
		classloader = classloader.getParent();
		System.out.println(classloader);
		
		//4.测试当前类由哪个类加载器进行加载
		classloader = Class.forName("java.lang.String").getClassLoader();
		System.out.println(classloader);
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-0.51));

		URL url = new URL("https://met.red/h/location/push?server=Fn8hqlldeiE1jvry");
		URLConnection connection = url.openConnection();
		HttpURLConnection connection1 = (HttpURLConnection) connection;

		connection1.connect();

		InputStream inputStream = connection1.getInputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while((len= inputStream.read(b))!=-1){
			System.out.println(new String(b,0,len));
		}

		int a = 8;
		int b1 = 3;
		System.out.println(a>>>b1);
		System.out.println(a);
		System.out.println(b1);

		System.out.println(a>>>b1 | 2);
	}
	
}
