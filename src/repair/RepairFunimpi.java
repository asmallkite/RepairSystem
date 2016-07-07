package repair;

import java.sql.*;

import utils.DbUtils;

public class RepairFunimpi implements RepairFun {
		
		public RepairFunimpi(){
		}

		public RepairFunimpi(Connection conn) {
		}

	
		    public Repair getRepByNo(int  repair_number) {
		        Connection connection = null;
		        PreparedStatement preparedStatement = null;
		        ResultSet resultSet = null;
		     Repair repair = new Repair();
		        try {
		            connection = DbUtils.getConnection();
		            String sql = "SELECT * from repair  where  repair_number = ?";
		            preparedStatement = connection.prepareStatement(sql);
		            preparedStatement.setInt(1,  repair_number);
		            resultSet = preparedStatement.executeQuery();
		            while (resultSet.next()) {
		            	repair.setRepair_number(resultSet.getInt("repair_number"));
		            	repair.setRepair_man(resultSet.getString("repair_man"));
		            	repair.setRepair_check_record(resultSet.getString("repair_check_record"));
		            	repair.setRepair_record(resultSet.getString("repair_record"));
		            	repair.setRepair_check_time(resultSet.getString("repair_check_time"));
		            	repair.setRepair_work_amount(resultSet.getString("repair_work_amount"));		            	
		            	repair.setRepair_use_device(resultSet.getString("repair_use_device"));
		            	repair.setRepair_state(resultSet.getString("repair_state"));
		               
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            DbUtils.closeResultSet(resultSet);
		            DbUtils.closePrepareStatement(preparedStatement);
		            DbUtils.closeConnection(connection);
		        }
		        return  repair;
		    }

	
		    public void insertRep(Repair repair) {
		        Connection connection = null;
		        PreparedStatement preparedStatement = null;

		        try {
		            connection = DbUtils.getConnection();
		            String sql = "INSERT INTO repair VALUES(?,?,?,?,?,?,?,?)";
		            preparedStatement = connection.prepareStatement(sql);
		            preparedStatement.setInt(1, repair.getRepair_number());
		            preparedStatement.setString(2, repair.getRepair_man());
		            preparedStatement.setString(3,repair.getRepair_check_record());
		            preparedStatement.setString(4, repair.getRepair_record());
		            preparedStatement.setString(5, repair.getRepair_check_time());
		            preparedStatement.setString(6, repair.getRepair_work_amount());
		            preparedStatement.setString(7, repair.getRepair_use_device());		        
		            preparedStatement.setString(8,repair.getRepair_state());
		            preparedStatement.executeUpdate();

		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            DbUtils.closePrepareStatement(preparedStatement);
		            DbUtils.closeConnection(connection);
		        }
		    }

		    public void deleteRepByNo(int repair_number) {
		        Connection connection = null;
		        PreparedStatement preparedStatement = null;
		        try {
		            connection = DbUtils.getConnection();
		            
		            String sql = "DELETE  from repair  where repair_number = ?";
		            preparedStatement = connection.prepareStatement(sql);
		            preparedStatement.setInt(1, repair_number);
		            preparedStatement.executeUpdate();
		        }catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            DbUtils.closePrepareStatement(preparedStatement);
		            DbUtils.closeConnection(connection);
		        }
		    }

		

			@Override
			public void updateRepByNo(Repair repair) {
				
				Connection connection = null;
		        PreparedStatement preparedStatement = null;

		        try {
		            connection = DbUtils.getConnection();
		            String sql = "UPDATE repair set repair_man=? , repair_check_record = ?, repair_record=?, repair_check_time=?"
		            		+ "repair_work_amount=?,repair_use_device=?,repair_state=? where repair_number=?";
		          
		            preparedStatement = connection.prepareStatement(sql);
		            
		            preparedStatement.setString(1, repair.getRepair_man());
		            preparedStatement.setString(2,repair.getRepair_check_record());
		            preparedStatement.setString(3, repair.getRepair_record());
		            preparedStatement.setString(4, repair.getRepair_check_time());
		            preparedStatement.setString(5, repair.getRepair_work_amount());
		            preparedStatement.setString(6, repair.getRepair_use_device());		        
		            preparedStatement.setString(7,repair.getRepair_state());
		            preparedStatement.setInt(8, repair.getRepair_number());
		            preparedStatement.executeUpdate();

		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            DbUtils.closePrepareStatement(preparedStatement);
		            DbUtils.closeConnection(connection);
		        }
				
				
			}

	}



