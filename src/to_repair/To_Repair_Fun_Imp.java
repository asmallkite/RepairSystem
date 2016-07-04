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
	        To_Repair_Fun_Imp to_Repair_Fun_Imp = new To_Repair_Fun_Imp();
	        try {
	            connection = DbUtils.getConnection();
	            String sql = "SELECT * from to_repair  where to_repair_number = ?";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, customer_number);
	            resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	                customer.setCustomer_number(resultSet.getInt("customer_number"));
	                customer.setCustomer_id(resultSet.getString("customer_id"));
	                customer.setCustomer_send_mac(resultSet.getDate("customer_send_mac"));
	                customer.setCustomer_nature(resultSet.getString("customer_nature"));
	                customer.setCustomer_nature(resultSet.getString("customer_unit"));
	                customer.setCustomer_tel(resultSet.getString("customer_tel"));
	                customer.setCustomer_phone(resultSet.getString("customer_phone"));
	                customer.setCustomer_address(resultSet.getString("customer_address"));
	                customer.setCustomer_postcode(resultSet.getString("customer_postcode"));
	                customer.setCustomer_contacts(resultSet.getString("customer_contacts"));
	                customer.setCustomer_email(resultSet.getString("customer_email"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closeResultSet(resultSet);
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	        return  customer;
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
