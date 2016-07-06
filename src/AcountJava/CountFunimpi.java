package AcountJava;
import java.sql.*;

import utils.DbUtils;


public class CountFunimpi implements CountFun {
	
	public CountFunimpi() {
	}

	public CountFunimpi(Connection conn) {
	}
	 @Override
	    public Count getCouByNo(int  se_repair_number) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;
	     Count count = new Count();
	        try {
	            connection = DbUtils.getConnection();
	            String sql = "SELECT * from account  where  se_repair_number = ?";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1,  se_repair_number);
	            resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	            	count.setSe_repair_number(resultSet.getInt("se_repair_number"));
	            	count.setSe_repair_cast(resultSet.getString("se_repair_cast"));
	                count.setSe_material_cast(resultSet.getString("se_material_cast"));
	                count.setSe_attention(resultSet.getString("se_attention"));
	                count.setSe_time(resultSet.getString("se_time"));
	               
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closeResultSet(resultSet);
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	        return  count;
	    }

	 @Override
	    public void insertCou(Count count) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connection = DbUtils.getConnection();
	            String sql = "INSERT INTO account VALUES(?,?,?,?,?)";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, count.getSe_repair_number());
	            preparedStatement.setString(2, count.getSe_repair_cast());
	            preparedStatement.setString(3, count.getSe_material_cast());
	            preparedStatement.setString(4, count.getSe_attention());
	            preparedStatement.setString(5,count.getSe_time());   
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	    }

	    @Override
	    public void deleteCouByNo(int se_repair_number) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        try {
	            connection = DbUtils.getConnection();
	            
	            String sql = "DELETE  from account  where se_repair_number = ?";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, se_repair_number);
	            preparedStatement.executeUpdate();
	        }catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	    }


		@Override
		public void updateCouByNo(int se_repair_number) {
		Count acount = new Count();
		CountFunManage manage = CountFunManage.getInstance();
		manage.insertCou(acount);
			
		}

}
