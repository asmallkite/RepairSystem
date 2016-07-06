package log_in_out;

import java.sql.Connection;

import utils.DbUtils;
import utils.ServiceException;


public class Log_in_out_manage {
	
	private static Log_in_out_manage instance = new Log_in_out_manage();
	
	public  static Log_in_out_manage getInstance() {
		
		return instance;
	}
	
	public void add_id_pw_manage (Log_in_out log_in_out){
		Connection connection = null;
		try{
			connection = DbUtils.getConnection();
			Log_in_out_impl log_Impl = new Log_in_out_impl();
			DbUtils.beginTransaction(connection);
			log_Impl.add_id_pw(log_in_out);
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
	
	
	
	
	public Log_in_out find_id_pw_manage (String userid){
		Log_in_out user = new Log_in_out();
		Connection connection = null;
		try{
			connection = DbUtils.getConnection();
			Log_in_out_impl log_Impl = new Log_in_out_impl();
			DbUtils.beginTransaction(connection);
			user = log_Impl.getLogById(userid);
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
		return user;
		
	}

}
