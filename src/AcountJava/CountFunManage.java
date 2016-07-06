package AcountJava;
	import java.sql.Connection;

	import utils.DbUtils;
	import utils.ServiceException;

	/**
	 * �û���Ϣ�Ĺ����ࣨ���õ���ģʽʵ�֣�
	 */
	public class CountFunManage {
		/**
		 * ��ʵ��
		 */
		private static CountFunManage instance = new CountFunManage();
		/**
		 * ȡ��ʵ�� 
		 * @return ʵ�����
		 */
		public static CountFunManage getInstance(){
			return instance;
		}
		/**
		 * ���췽�� 
		 */
		private  CountFunManage() {
		}
		
		/**
		 * ͨ���Ų�ѯ
		 * @param customer_number
		 * @return
		 */
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
		/**
		 * �����û�
		 * @param customer
		 */
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
		
		
		
		 public void updateCouByNo(int se_repair_number) {
			 Connection connection = null;
				try{
					connection = DbUtils.getConnection();
					CountFunimpi countFunImpl = new CountFunimpi(connection);
					DbUtils.beginTransaction(connection);
					countFunImpl.updateCouByNo(se_repair_number);
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


