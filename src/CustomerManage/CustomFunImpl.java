package CustomerManage;
import java.sql.*;

import utils.DbUtils;


public class CustomFunImpl implements CustomFun {
	
	public CustomFunImpl() {
	}
	/**
	 * 构造方法
	 * @param conn 数据库连接
	 */
	public CustomFunImpl(Connection conn) {
	}
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
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;

	        try {
	            connection = DbUtils.getConnection();
	            String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, customer.getCustomer_number());
	            preparedStatement.setString(2, customer.getCustomer_id());
	            preparedStatement.setDate(3, (Date) customer.getCustomer_send_mac());
	            preparedStatement.setString(4, customer.getCustomer_nature());
	            preparedStatement.setString(5, customer.getCustomer_unit());
	            preparedStatement.setString(6, customer.getCustomer_tel());
	            preparedStatement.setString(7, customer.getCustomer_phone());
	            preparedStatement.setString(8, customer.getCustomer_address());
	            preparedStatement.setString(9, customer.getCustomer_postcode());
	            preparedStatement.setString(10, customer.getCustomer_contacts());
	            preparedStatement.setString(11, customer.getCustomer_email());
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	    }

	    @Override
	    public void deleteCusByNo(int customer_number) {
	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        try {
	            connection = DbUtils.getConnection();
	            //执行删除语句
	            String sql = "DELETE  from customer  where customer_number = ?";
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, customer_number);
	            preparedStatement.executeUpdate();
	        }catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            DbUtils.closePrepareStatement(preparedStatement);
	            DbUtils.closeConnection(connection);
	        }
	    }

	    @Override
		public void updateCusByNo(Customer customer) {
			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = DbUtils.getConnection();
				String sql = "UPDATE customer set customer_id = ? , customer_send_mac = ? ,customer_nature = ?, customer_unit=?, " +
						"customer_tel=?, customer_phone=?, customer_address=?, customer_postcode=?, customer_contacts=?, customer_email=? where customer_number=?";
//				String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?,?,?)";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, customer.getCustomer_id());
				preparedStatement.setDate(2, (Date) customer.getCustomer_send_mac());
				preparedStatement.setString(3, customer.getCustomer_nature());
				preparedStatement.setString(4, customer.getCustomer_unit());
				preparedStatement.setString(5, customer.getCustomer_tel());
				preparedStatement.setString(6, customer.getCustomer_phone());
				preparedStatement.setString(7, customer.getCustomer_address());
				preparedStatement.setString(8, customer.getCustomer_postcode());
				preparedStatement.setString(9, customer.getCustomer_contacts());
				preparedStatement.setString(10, customer.getCustomer_email());
				preparedStatement.setInt(11, customer.getCustomer_number());
				preparedStatement.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DbUtils.closePrepareStatement(preparedStatement);
				DbUtils.closeConnection(connection);
			}

		}
}
