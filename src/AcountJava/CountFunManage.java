package AcountJava;
	import java.sql.Connection;

	import utils.DbUtils;
import utils.ServiceException;

	
	public class CountFunManage {
	
		private static CountFunManage instance = new CountFunManage();
		
		public static CountFunManage getInstance(){
			return instance;
		}
		
		private  CountFunManage() {
		}
		
	
		public Count getCouByNo(int se_repair_number){
			Count count = null;
			Connection connection = null;
			try{
				connection = DbUtils.getConnection();
				CountFunimpi countFunImpl = new CountFunimpi(connection);
				DbUtils.beginTransaction(connection);
				count = countFunImpl.getCouByNo(se_repair_number);
				DbUtils.commit(connection);
			} catch (ServiceException e) {
				throw e;
			} catch (Exception e) {
				DbUtils.rollback(connection);
				throw new ServiceException("查询结算信息失败", e);
				//e.printStackTrace();
			} finally {
				DbUtils.closeConnection(connection);
			}
			return count;
			
		}
		
		public void insertCou(Count count){
			Connection connection = null;
			try{
				connection = DbUtils.getConnection();
				CountFunimpi countFunImpl = new CountFunimpi(connection);
				DbUtils.beginTransaction(connection);
				countFunImpl.insertCou(count);
				DbUtils.commit(connection);
		} catch (ServiceException e) {
			throw e;
		} catch (Exception e) {
			DbUtils.rollback(connection);
			throw new ServiceException("增加结算信息失败", e);
			//e.printStackTrace();
		} finally {
			DbUtils.closeConnection(connection);
		}
		}
		
		public void deleteCouByNo(int se_repair_number){
			Connection connection = null;
			try{
				connection = DbUtils.getConnection();
				CountFunimpi countFunimpi = new CountFunimpi(connection);
				DbUtils.beginTransaction(connection);
				countFunimpi.deleteCouByNo(se_repair_number);
				DbUtils.commit(connection);
		} catch (ServiceException e) {
			throw e;
		} catch (Exception e) {
			DbUtils.rollback(connection);
			throw new ServiceException("删除结算信息失败", e);
			//e.printStackTrace();
		} finally {
			DbUtils.closeConnection(connection);
		}
			
		}
		
		
		
		 public void updateCouByNo(Count count) {
			 Connection connection = null;
				try{
					connection = DbUtils.getConnection();
					CountFunimpi countFunImpl = new CountFunimpi(connection);
					DbUtils.beginTransaction(connection);
					countFunImpl.updateCouByNo(count);
					DbUtils.commit(connection);
			} catch (ServiceException e) {
				throw e;
			} catch (Exception e) {
				DbUtils.rollback(connection);
				throw new ServiceException("修改结算信息失败", e);
				//e.printStackTrace();
			} finally {
				DbUtils.closeConnection(connection);
			}
		    }
	}


