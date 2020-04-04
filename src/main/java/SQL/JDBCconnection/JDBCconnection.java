package SQL.JDBCconnection;

import org.junit.Test;

import java.sql.*;

public class JDBCconnection {

    @Test
    public void select() throws SQLException {
        Connection connection = JDBCutils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from person");

        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            String string = resultSet.getString(1);
            System.out.println(string);
        }

        JDBCutils.close(connection,preparedStatement);
    }

    @Test
    public void update() throws SQLException {
        Connection connection = JDBCutils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE person SET sname=(?)");
        preparedStatement.setString(1,"fj");
        preparedStatement.executeUpdate();

        JDBCutils.close(connection,preparedStatement);

    }

    @Test
    public void delete() throws SQLException {
        Connection connection = JDBCutils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE  FROM person WHERE sname=(?)");
        preparedStatement.setString(1,"詹丹");
        preparedStatement.executeUpdate();
        JDBCutils.close(connection,preparedStatement);

    }

    /**
     * 操作数据库
     * 插入数据
     */
    @Test
    public void insert() throws SQLException {
        //获取数据库连接对象
        Connection connection = JDBCutils.getConnection();
        //预编译，获取可以操作数据库的对象
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO person(sname) VALUES(?)");
        preparedStatement.setString(1,"詹丹");
        preparedStatement.executeUpdate();

        JDBCutils.close(connection,preparedStatement);

    }

    @Test
    public void test() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myemployees", "root", "qq123456");
        System.out.println(connection);
    }
}
