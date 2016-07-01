package CustomerManage;

import java.sql.Connection;

import utils.DbUtils;
import utils.ServiceException;


/**
 * 用户信息的管理类（采用单例模式实现）
 */
public class CustomerFunManage {
	/**
	 * 类实例
	 */
	private static CustomerFunManage instance = new CustomerFunManage();
	/**
	 * 取得实例 
	 * @return 实例对象
	 */
	public static CustomerFunManage getInstance(){
		return instance;
	}
	/**
	 * 构造方法 
	 */
	private  CustomerFunManage() {
	}
	
	/**
	 * 通过编号查询
	 * @param customer_number
	 * @return
	 */
	public Customer getCusByNo(int customer_number){
		Customer customer = null;
		Connection connection = null;
		try{
			connection = DbUtils.getConnection();
			CustomFunImpl customFunImpl = new CustomFunImpl(connection);
			DbUtils.beginTransaction(connection);
			customer = customFunImpl.getCusByNo(customer_number);
			DbUtils.commit(connection);
		} catch (ServiceException e) {
			throw e;
		} catch (Exception e) {
			DbUtils.rollback(connection);
			throw new ServiceException("查询用户错误", e);
			//e.printStackTrace();
		} finally {
			DbUtils.closeConnection(connection);
		}
		return customer;
		
	}
	/**
	 * 插入用户
	 * @param customer
	 */
	public void insertCus(Customer customer){
		Connection connection = null;
		try{
			connection = DbUtils.getConnection();
			CustomFunImpl customFunImpl = new CustomFunImpl(connection);
			DbUtils.beginTransaction(connection);
			customFunImpl.insertCus(customer);
			DbUtils.commit(connection);
	} catch (ServiceException e) {
		throw e;
	} catch (Exception e) {
		DbUtils.rollback(connection);
		throw new ServiceException("插入用户错误", e);
		//e.printStackTrace();
	} finally {
		DbUtils.closeConnection(connection);
	}
	}
	
	public void deleteCusByNo(int customer_number){
		Connection connection = null;
		try{
			connection = DbUtils.getConnection();
			CustomFunImpl customFunImpl = new CustomFunImpl(connection);
			DbUtils.beginTransaction(connection);
			customFunImpl.deleteCusByNo(customer_number);
			DbUtils.commit(connection);
	} catch (ServiceException e) {
		throw e;
	} catch (Exception e) {
		DbUtils.rollback(connection);
		throw new ServiceException("删除用户错误", e);
		//e.printStackTrace();
	} finally {
		DbUtils.closeConnection(connection);
	}
		
	}
	
	
	
	 public void updateCusByNo(Customer customer) {
	     this.insertCus(customer);
	    }
}
