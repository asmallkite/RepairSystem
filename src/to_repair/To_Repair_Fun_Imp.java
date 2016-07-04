package to_repair;

import java.sql.Connection;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteToRepairByNo(String to_repair_number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateToRepairByNo(String to_repair_number) {
		// TODO Auto-generated method stub
		
	}
	
	

}
