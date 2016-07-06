package Spare;

import java.sql.*;

import utils.DbUtils;


public class SpareFunimpi implements SpareFun {
	
	public SpareFunimpi() {
	}

	public SpareFunimpi(Connection conn) {
	}
	 @Override
	    public Spare getSpaByNo(String spare_name) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;
	    Spare spare = new Spare();

	        try {
	            connection = DbUtils.getConnection();
	            String sql = "SELECT * from spare  where  spare_name = ?";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1,  spare_name);
	            resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	            	spare.setSpare_name(resultSet.getString("spare_name"));
	            	spare.setSpare_typw(resultSet.getString("spare_typw"));            	
	            	spare.setSpare_count(resultSet.getInt("spare_count"));
	            	spare.setSpare_price(resultSet.getString("spare_price"));
	            	spare.setSpare_to_lib_time(resultSet.getString("spare_to_lib_time"));
	            	spare.setSpare_alert_count(resultSet.getInt("spare_alert_count"));
	               
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closeResultSet(resultSet);
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	        return  spare;
	    }

	 @Override
	    public void insertSpa(Spare spare) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connection = DbUtils.getConnection();
	            String sql = "INSERT INTO spare VALUES(?,?,?,?,?,?)";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, spare.getSpare_name());
	            preparedStatement.setString(2, spare.getSpare_typw());
	            preparedStatement.setInt(3, spare.getSpare_count());
	            preparedStatement.setString(4, spare.getSpare_price());
	            preparedStatement.setString(5, spare.getSpare_to_lib_time());
	            preparedStatement.setInt(6,spare.getSpare_alert_count());
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	    }

	    @Override
	    public void deleteSpaByNo(String spare_name) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        try {
	            connection = DbUtils.getConnection();
	            
	            String sql = "DELETE  from spare  where spare_name = ?";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, spare_name);
	            preparedStatement.executeUpdate();
	        }catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	    }

	

}
