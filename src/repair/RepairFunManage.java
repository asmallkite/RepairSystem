package repair;
import java.sql.Connection;
import utils.DbUtils;
import utils.ServiceException;
public class RepairFunManage {
	
		private static RepairFunManage instance = new RepairFunManage();
		/**
		 * ȡ��ʵ�� 
		 * @return ʵ�����
		 */
		public static RepairFunManage getInstance(){
			return instance;
		}
		/**
		 * ���췽�� 
		 */
		private  RepairFunManage() {
		}
		
		/**
		 * ͨ查询用户
		 * @param customer_number
		 * @return
		 */
		public Repair getRepByNo(int repair_number){
			Repair repair = null;
			Connection connection = null;
			try{
				connection = DbUtils.getConnection();
				RepairFunimpi repairFunImpl = new RepairFunimpi(connection);
				DbUtils.beginTransaction(connection);
				repair = repairFunImpl.getRepByNo(repair_number);
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
			return repair;
			
		}
		/**
		 * 插入用户
		 * @param customer
		 */
		public void insertRep(Repair repair){
			Connection connection = null;
			try{
				connection = DbUtils.getConnection();
				RepairFunimpi repairFunImpl = new RepairFunimpi(connection);
				DbUtils.beginTransaction(connection);
				repairFunImpl.insertRep(repair);
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
		
		public void deleteRepByNo(int se_repair_number){
			Connection connection = null;
			try{
				connection = DbUtils.getConnection();
				RepairFunimpi repairFunimpi = new RepairFunimpi(connection);
				DbUtils.beginTransaction(connection);
				repairFunimpi.deleteRepByNo(se_repair_number);
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
		
		
		
		 public void updateCouByNo(int repair_number) {
			 Connection connection = null;
				try{
					connection = DbUtils.getConnection();
					RepairFunimpi repairFunimpi = new RepairFunimpi(connection);
					DbUtils.beginTransaction(connection);
					repairFunimpi.updateRepByNo(repair_number);
					DbUtils.commit(connection);
			} catch (ServiceException e) {
				throw e;
			} catch (Exception e) {
				DbUtils.rollback(connection);
				throw new ServiceException("修改用户错误", e);
				//e.printStackTrace();
			} finally {
				DbUtils.closeConnection(connection);
			}
				
		    }
	}





