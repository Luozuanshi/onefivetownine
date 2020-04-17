package SQL.JDBCconnection.java;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;


public class JDBCUtils {

	/**
	 * 获取数据库连接
	 * @return
	 */
	public static Connection getConnection() {
		try {
			// 读取配置文件中的内容
			FileInputStream fis = new FileInputStream("jdbc.properties");
			Properties properties = new Properties();
			properties.load(fis);
			String url = properties.getProperty("url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");
			String driverClassName = properties.getProperty("driverClassName");
			fis.close();

			// 目的 ：就是为了让com.mysql.jdbc.Driver中的静态代码块执行
			Class.forName(driverClassName);
			// 直接通过DriverManager获取连接
			Connection connection = DriverManager.getConnection(url, user, password);
			
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();//如果发生异常，终止程序运行。
		}
	}
	
	/**
	 * 关资源
	 * @param connection
	 * @param ps
	 */
	public static void close(Connection connection,PreparedStatement ps){
		if(connection != null){
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(ps != null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 关资源
	 */
	public static void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		close(connection,ps);
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
