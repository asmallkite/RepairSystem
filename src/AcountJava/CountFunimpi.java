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
	            String sql = "SELECT * from accounta  where  se_repair_number = ?";
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
	            String sql = "INSERT INTO accounta VALUES(?,?,?,?,?)";
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
	            
	            String sql = "DELETE  from accounta  where se_repair_number = ?";
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
		public  void updateCouByNo(Count count) {
			 Connection connection = null;
		        PreparedStatement preparedStatement = null;

		        try {
		            connection = DbUtils.getConnection();
//		            String sql = "UPDATE account set se_repair_cast = 'I', se_material_cast = 'ddd', se_attention= 'ddss', se_time = 'dsd' "
//		            		+ " where se_repair_number = 6";
		            String sql = "UPDATE accounta set se_repair_cast = ?, se_material_cast = ?, se_attention= ?, se_time = ?"
		            		+ " where se_repair_number = ?";
//		            System.out.println(sql);
      
		            preparedStatement = connection.prepareStatement(sql);
		           
		            preparedStatement.setString(1, count.getSe_repair_cast());
		            
		            preparedStatement.setString(2, count.getSe_material_cast());
		            preparedStatement.setString(3, count.getSe_attention());
		            preparedStatement.setString(4,count.getSe_time());  
		            preparedStatement.setInt(5, count.getSe_repair_number());
		            System.out.println("zhi");
//		            connection.commit();
		           preparedStatement.executeUpdate();
		            System.out.println("zhixingwnabi");

		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            DbUtils.closePrepareStatement(preparedStatement);
		            DbUtils.closeConnection(connection);
		        }
			
		}

}
