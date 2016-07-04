package to_repair;

import java.sql.Connection;

import utils.DbUtils;
import utils.ServiceException;


/**
 * 用户信息的管理类（采用单例模式实现）
 */
public class To_Repair_Fun_Manage {
	/**
	 * 类实例
	 */
	private static To_Repair_Fun_Manage instance = new To_Repair_Fun_Manage();
	/**
	 * 取得实例 
	 * @return 实例对象
	 */
	public static To_Repair_Fun_Manage getInstance(){
		return instance;
	}
	/**
	 * 构造方法 
	 */
	private  To_Repair_Fun_Manage() {
	}
	
	/**
	 * 通过编号查询
	 * @param customer_number
	 * @return
	 */
	public To_repair_stament getCusByNo(String to_repair_number){
		To_repair_stament to_repair_stament = null;
		Connection connection = null;
		try{
			connection = DbUtils.getConnection();
			To_Repair_Fun_Imp to_Repair_Fun_Imp = new To_Repair_Fun_Imp(connection);
			DbUtils.beginTransaction(connection);
			to_repair_stament = to_Repair_Fun_Imp.getToRepairByNo(to_repair_number);
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
		return to_repair_stament;
		
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
