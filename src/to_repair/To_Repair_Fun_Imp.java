package to_repair;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.DbUtils;


public class To_Repair_Fun_Imp implements To_repair_Fun {
	public To_Repair_Fun_Imp() {
	}
	/**
	 * 构造方法
	 * @param conn 数据库连接
	 */
	public To_Repair_Fun_Imp(Connection conn) {
	}
	

	@Override
	public To_repair_stament getToRepairByNo(String to_repair_number) {
		 Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;
	        To_repair_stament to_repair_stament = new To_repair_stament();
	        try {
	            connection = DbUtils.getConnection();
	            String sql = "SELECT * from to_repair  where to_repair_number = ?";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, to_repair_number);
	            resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	            	to_repair_stament.setTo_repair_number(resultSet.getString("to_repair_number"));
	            	to_repair_stament.setCustomer_number(resultSet.getString("customer_number"));
	            	to_repair_stament.setTo_repair_product_type(resultSet.getString("to_repair_product_type"));
	            	to_repair_stament.setTo_repair_mac_brand(resultSet.getString("to_repair_mac_brand"));
	               	to_repair_stament.setTo_repair_mac_type(resultSet.getString("to_repair_mac_type"));
	            	to_repair_stament.setCustomer_number(resultSet.getString("to_repair_serial"));
	            	to_repair_stament.setTo_repair_serial(resultSet.getString("to_repair_lack_part"));
	            	to_repair_stament.setTo_repair_trouble_phen(resultSet.getString("to_repair_trouble_phen"));
	               	to_repair_stament.setTo_repair_trouble_type(resultSet.getString("to_repair_trouble_type"));
	            	to_repair_stament.setTo_repair_facial_check(resultSet.getString("to_repair_facial_check"));
	            	to_repair_stament.setTo_repair_start_cmd(resultSet.getString("to_repair_start_cmd"));
	            	to_repair_stament.setTo_repair_impo_files(resultSet.getString("to_repair_impo_files"));
	               	to_repair_stament.setTo_repair_hdd(resultSet.getString("to_repair_hdd"));
	            	to_repair_stament.setTo_repair_pc(resultSet.getString("to_repair_pc"));
	            	to_repair_stament.setTo_repair_ac(resultSet.getString("to_repair_ac"));
	            	to_repair_stament.setTo_repair_battery(resultSet.getString("to_repair_battery"));
	               	to_repair_stament.setTo_repair_cd_driver(resultSet.getString("to_repair_cd_driver"));
	            	to_repair_stament.setTo_repair_floppy(resultSet.getString("to_repair_floppy"));
	            	to_repair_stament.setTo_repair_time(resultSet.getString("to_repair_time"));
	            	to_repair_stament.setTo_repair_price(resultSet.getString("to_repair_price"));
	            	to_repair_stament.setTo_repair_state(resultSet.getString("to_repair_state"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closeResultSet(resultSet);
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	        return  to_repair_stament;
	}

	@Override
	public void insertToRepair(To_repair_stament to_repair_stament) {
		 Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connection = DbUtils.getConnection();
	            String sql = "INSERT INTO to_repair VALUES(?,?,?,  ?,?,?,  ?,?,?,  ?,?,?, ?,?,?, ?,?,?, ?,?,?)";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, to_repair_stament.getTo_repair_number());
	            preparedStatement.setString(2, to_repair_stament.getCustomer_number());
	            preparedStatement.setString(3, to_repair_stament.getTo_repair_product_type());
	            
	            preparedStatement.setString(4, to_repair_stament.getTo_repair_mac_brand());
	            preparedStatement.setString(5, to_repair_stament.getTo_repair_mac_type());
	            preparedStatement.setString(6, to_repair_stament.getTo_repair_serial());
	            preparedStatement.setString(7, to_repair_stament.getTo_repair_lack_part());
	            
	            preparedStatement.setString(8, to_repair_stament.getTo_repair_trouble_phen());
	            preparedStatement.setString(9, to_repair_stament.getTo_repair_trouble_type());
	            preparedStatement.setString(10, to_repair_stament.getTo_repair_facial_check());
	            preparedStatement.setString(11,to_repair_stament.getTo_repair_start_cmd());
	            
	            preparedStatement.setString(12, to_repair_stament.getTo_repair_impo_files());
	            preparedStatement.setString(13, to_repair_stament.getTo_repair_hdd());
	            preparedStatement.setString(14, to_repair_stament.getTo_repair_pc());
	            preparedStatement.setString(15,to_repair_stament.getTo_repair_ac());
	            
	            preparedStatement.setString(16, to_repair_stament.getTo_repair_battery());
	            preparedStatement.setString(17, to_repair_stament.getTo_repair_cd_driver());
	            preparedStatement.setString(18, to_repair_stament.getTo_repair_floppy());
	            preparedStatement.setString(19,to_repair_stament.getTo_repair_time());
	            preparedStatement.setString(20, to_repair_stament.getTo_repair_price());
	            preparedStatement.setString(21,to_repair_stament.getTo_repair_state());
	      
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
		
	}

	@Override
	public void deleteToRepairByNo(String to_repair_number) {
		   Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        try {
	            connection = DbUtils.getConnection();
	            //执行删除语句
	            String sql = "DELETE  from to_repair  where to_repair_number = ?";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, to_repair_number);
	            preparedStatement.executeUpdate();
	        }catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
		
	}

	@Override
	public  void updateToRepair(To_repair_stament to_repair_stament) {
		 Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connection = DbUtils.getConnection();
	            
	            String sql = "UPDATE to_repair set   customer_number = ?,to_repair_product_type = ?,  to_repair_mac_brand = ?,"
	            		+ " to_repair_mac_type = ?,  to_repair_serial = ?, to_repair_lack_part = ?,  to_repair_trouble_phen = ?,"
	            		+ "to_repair_trouble_type = ?,  to_repair_facial_check = ?, to_repair_start_cmd = ?,  to_repair_impo_files = ?,"
	            		+ " to_repair_hdd = ?,  to_repair_pc = ?,  to_repair_ac = ?, to_repair_battery = ?,  to_repair_cd_driver = ?,"
	            		+ "to_repair_floppy = ?,  to_repair_time = ?, to_repair_price = ?,  to_repair_state = ? where to_repair_number = ?";
					 
	
	            preparedStatement = connection.prepareStatement(sql);
	            
	            preparedStatement.setString(1, to_repair_stament.getCustomer_number());
	            preparedStatement.setString(2, to_repair_stament.getTo_repair_product_type());
	            
	            preparedStatement.setString(3, to_repair_stament.getTo_repair_mac_brand());
	            preparedStatement.setString(4, to_repair_stament.getTo_repair_mac_type());
	            preparedStatement.setString(5, to_repair_stament.getTo_repair_serial());
	            preparedStatement.setString(6, to_repair_stament.getTo_repair_lack_part());
	            
	            preparedStatement.setString(7, to_repair_stament.getTo_repair_trouble_phen());
	            preparedStatement.setString(8, to_repair_stament.getTo_repair_trouble_type());
	            preparedStatement.setString(9, to_repair_stament.getTo_repair_facial_check());
	            preparedStatement.setString(10,to_repair_stament.getTo_repair_start_cmd());
	            
	            preparedStatement.setString(11, to_repair_stament.getTo_repair_impo_files());
	            preparedStatement.setString(12, to_repair_stament.getTo_repair_hdd());
	            preparedStatement.setString(13, to_repair_stament.getTo_repair_pc());
	            preparedStatement.setString(14,to_repair_stament.getTo_repair_ac());
	            
	            preparedStatement.setString(15, to_repair_stament.getTo_repair_battery());
	            preparedStatement.setString(16, to_repair_stament.getTo_repair_cd_driver());
	            preparedStatement.setString(17, to_repair_stament.getTo_repair_floppy());
	            preparedStatement.setString(18,to_repair_stament.getTo_repair_time());
	            preparedStatement.setString(19, to_repair_stament.getTo_repair_price());
	            preparedStatement.setString(20,to_repair_stament.getTo_repair_state());
	            preparedStatement.setString(21, to_repair_stament.getTo_repair_number());
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
		
		
	} 
	
	

}
