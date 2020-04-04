package SQL.JDBCconnection.java;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

/**
 	JDBC : 是java用来操作数据库的一组规范（接口）
 	
 	连接数据库说明：
 	1.导mysql驱动包
 	2.
 */
public class JDBCTest {
	
	@Test
	public void test4() throws Exception{
		//读取配置文件中的内容
		FileInputStream fis = new FileInputStream("jdbc.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		String driverClassName = properties.getProperty("driverClassName");
		fis.close();
		
		//目的 ：就是为了让com.mysql.jdbc.Driver中的静态代码块执行
		Class.forName(driverClassName);
		//直接通过DriverManager获取连接
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println(connection);
	}
	
	/**
	 * 第三种方式获取数据库连接
	 * @throws Exception 
	 */
	@Test
	public void test3() throws Exception{
		//目的 ：就是为了让com.mysql.jdbc.Driver中的静态代码块执行
		Class.forName("com.mysql.jdbc.Driver");
		//直接通过DriverManager获取连接
		String url = "jdbc:mysql://localhost:3306/xiaolongge";
		String user = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println(connection);
	}

	/**
	 * 第二种获取数据库连接的方式
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception{
		//注册驱动
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//获取数据库连接
		String url = "jdbc:mysql://localhost:3306/xiaolongge";
		String user = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url, user, password);
		
		System.out.println(connection);
	}
	
	/**
	 * 第一种获取数据库连接的方式
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception{
		//所有数据库厂商的驱动包必须实现的接口 - 用来操作数据库
		Driver driver = new com.mysql.jdbc.Driver();//多态
		//connect方法用来连接数据库
		/*
		 * url :  jdbc:mysql://localhost:3306/xiaolongge
		 * localhost : 数据库服务器的地址
		 * 3306 ：端口号
		 * xiaolongge : 库的名称
		 */
		Properties properties = new Properties();
		//user ：指的是数据库的账号
		//password : 指的是数据库的密码
		properties.setProperty("user", "root");
		properties.setProperty("password", "root");
		//获取数据库的连接对象Connection
		Connection connect = driver.connect("jdbc:mysql://localhost:3306/xiaolongge", properties);
		
		System.out.println(connect);
	}
}







