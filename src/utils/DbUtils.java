package utils;


import java.sql.*;


public class DbUtils {
        //静态代码块
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("conncetion start!");
    }
    //连接数据库
     public static Connection getConnection(){
        Connection connection = null;
        String url = "jdbc:oracle:" + "thin:@127.0.0.1:1521:orcl";
        String user = "scott";
        String password = "orcl";
        try {
            connection  = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  connection;
    }

    public static void beginTransaction(Connection conn) {
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			throw new ServiceException("Can not begin transaction", e);
		}
	}

	public static void commit(Connection conn) {
		try {
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			throw new ServiceException("Can not commit transaction", e);
		}
	}

	public static void rollback(Connection conn) {
		try {
			conn.rollback();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			throw new ServiceException("Can not rollback transaction", e);
		}
	}

    //关闭ResultSet
    public static void closeResultSet (ResultSet resultSet){
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    //关闭PreparedStatement
    public  static void closePrepareStatement(PreparedStatement preparedStatement){
    if (preparedStatement != null){
        try {
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

    //关闭数据库connection
    public static void closeConnection(Connection connection){
        if (connection !=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



}

