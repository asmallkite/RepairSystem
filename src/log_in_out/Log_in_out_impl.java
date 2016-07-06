package log_in_out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.DbUtils;

public class Log_in_out_impl {
	
	public  Log_in_out_impl (){
		
	}
	
	public void add_id_pw(Log_in_out log_in_out){
		 Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connection = DbUtils.getConnection();
	            String sql = "INSERT INTO log_in_out VALUES(?,?)";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, log_in_out.getUserid() );
	            preparedStatement.setString(2, log_in_out.getPassword() );
	           
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	}
	
	
	
	 public Log_in_out getLogById(String userid) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;
	       Log_in_out log_in_out = new Log_in_out();
	        try {
	            connection = DbUtils.getConnection();
	            String sql = "SELECT * from log_in_out  where userid = ?";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, userid);
	            resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	                log_in_out.setUserid(resultSet.getString("userid"));
	                log_in_out.setPassword(resultSet.getString("password"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closeResultSet(resultSet);
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	        return  log_in_out;
	    }

}
