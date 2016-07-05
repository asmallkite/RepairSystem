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
	
	
	public To_repair_stament getToRepairByNo(String to_repair_number){
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
	public void insertToRepair(To_repair_stament to_repair_stament){
		Connection connection = null;
		try{
			connection = DbUtils.getConnection();
			To_Repair_Fun_Imp to_Repair_Fun_Imp = new To_Repair_Fun_Imp(connection);
			DbUtils.beginTransaction(connection);
			to_Repair_Fun_Imp.insertToRepair(to_repair_stament);
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
	
	public void deleteToRepairByNo(String to_repair_number){
		Connection connection = null;
		try{
			connection = DbUtils.getConnection();
			To_Repair_Fun_Imp to_Repair_Fun_Imp = new To_Repair_Fun_Imp(connection);
			DbUtils.beginTransaction(connection);
			to_Repair_Fun_Imp.deleteToRepairByNo(to_repair_number);
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
	
	
	
	 public void updateCusByNo(String to_repair_number) {
	     this.deleteToRepairByNo(to_repair_number);
	    }
}
