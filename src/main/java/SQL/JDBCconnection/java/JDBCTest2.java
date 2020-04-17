package SQL.JDBCconnection.java;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
	通过Connection的连接对象操作数据库
 */
public class JDBCTest2 {
	
	
	/**
	 * 查询数据库中的数据
	 * @throws Exception 
	 */
	@Test
	public void test4() throws Exception{
		List<Employee> list = new ArrayList<>();
		
		Connection connection = JDBCUtils.getConnection();
		PreparedStatement ps = connection.prepareStatement("select id,name from employee");
		//通过ResultSet获取所有的查询结果
		ResultSet rs = ps.executeQuery();
		//next() : 是否有下一条数据，如果有返回true,否则返回false
		while(rs.next()){
			//通过指明列的索引值获取对应的数据
			int id = rs.getInt(1);
			//通过字段名获取对应的数据
//			rs.getInt("id");
			String name = rs.getString(2);
			System.out.println("id=" + id + " name=" + name);
			//封装对象
			Employee employee = new Employee(id, name);
			list.add(employee);
		}
		//关资源
		JDBCUtils.close(connection, ps,rs);
	}
	
	
	/**
	 * 删除数据
	 * @throws Exception 
	 */
	@Test
	public void test3() throws Exception{
		Connection connection = JDBCUtils.getConnection();
		PreparedStatement ps = connection.prepareStatement("delete from employee where id=?");
		ps.setInt(1, 2);
		ps.executeUpdate();
		JDBCUtils.close(connection, ps);
		
	}
	
	/**
	 * 修改数据库中的数据
	 * @throws Exception 
	 */
	@Test
	public void test2() throws Exception{
		//1.先获取数据库的连接
		Connection connection = JDBCUtils.getConnection();
		//2.预编译
		PreparedStatement ps = connection.prepareStatement("UPDATE employee SET NAME=? WHERE id=?");
		//3.给占位符赋值
		ps.setString(1, "fff");
		ps.setInt(2, 2);
		//4.执行sql语句
		ps.executeUpdate();
		//5.关资源
		JDBCUtils.close(connection, ps);
	}

	/**
	 * 向数据库中插入一条数据
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception{
		//1.先获取数据库的连接
		Connection connection = JDBCUtils.getConnection();
		//2.预编译 - 获取可以操作数据库的对象
		// ? : 占位符
		PreparedStatement ps = connection.prepareStatement("INSERT INTO employee(NAME) VALUES(?)");
		//3.给占位符设置数据
		//setString(int parameterIndex, String x) :
		//parameterIndex ： 指的是占位符的索引位置（从1开始）
		//x : 给占位符的位置赋值的数据
		ps.setString(1, "abc");
		//4.执行sql命令
		//execute() : 任何sql语句都可以执行
		//executeQuery() : 可以执行查询语句
		//executeUpdate() : 可以执行增删改的语句
		int executeUpdate = ps.executeUpdate(); //返回值 ：有多少行数据受到影响
		//5.关资源
		JDBCUtils.close(connection, ps);
	}
}
