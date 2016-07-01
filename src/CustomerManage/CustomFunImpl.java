package CustomerManage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomFunImpl implements CustomFun {
	 @Override
	    public Customer getCusByNo(int customer_number) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultSet = null;
	        Customer customer = new Customer();
	        try {
	            connection = DbUtils.getConnection();
	            String sql = "SELECT * from customer  where customer_number = ?";
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
	public void insertCus(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCusByNo(int customer_number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCusByNo(int customer_number) {
		// TODO Auto-generated method stub
		
	}

}