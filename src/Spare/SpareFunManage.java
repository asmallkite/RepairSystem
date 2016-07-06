package Spare;

	import java.sql.Connection;

	import utils.DbUtils;
import utils.ServiceException;
public class SpareFunManage {
	

		/**
		 * ��ʵ��
		 */
		private static SpareFunManage instance = new SpareFunManage();
		/**
		 * ȡ��ʵ�� 
		 * @return ʵ�����
		 */
		public static SpareFunManage getInstance(){
			return instance;
		}
		/**
		 * ���췽�� 
		 */
		private  SpareFunManage() {
		}
		
		/**
		 * ͨ���Ų�ѯ
		 * @param customer_number
		 * @return
		 */
		public Spare getSpaByNo(String spare_name){
			Spare spare = null;
			Connection connection = null;
			try{
				connection = DbUtils.getConnection();
				SpareFunimpi spareFunimpi = new SpareFunimpi(connection);
				DbUtils.beginTransaction(connection);
				spare = spareFunimpi.getSpaByNo(spare_name);
				DbUtils.commit(connection);
			} catch (ServiceException e) {
				throw e;
			} catch (Exception e) {
				DbUtils.rollback(connection);
				throw new ServiceException("��ѯ������Ϣ����", e);
				//e.printStackTrace();
			} finally {
				DbUtils.closeConnection(connection);
			}
			return spare;
			
		}
		/**
		 * �����û�
		 * @param customer
		 */
		public void insertSpa(Spare spare){
			Connection connection = null;
			try{
				connection = DbUtils.getConnection();
				SpareFunimpi countFunImpl = new SpareFunimpi(connection);
				DbUtils.beginTransaction(connection);
				countFunImpl.insertSpa(spare);
				DbUtils.commit(connection);
		} catch (ServiceException e) {
			throw e;
		} catch (Exception e) {
			DbUtils.rollback(connection);
			throw new ServiceException("���������Ϣ����", e);
			//e.printStackTrace();
		} finally {
			DbUtils.closeConnection(connection);
		}
		}
		
		public void deleteSpaByNo(String spare_name){
			Connection connection = null;
			try{
				connection = DbUtils.getConnection();
				SpareFunimpi countFunimpi = new SpareFunimpi(connection);
				DbUtils.beginTransaction(connection);
				countFunimpi.deleteSpaByNo(spare_name);
				DbUtils.commit(connection);
		} catch (ServiceException e) {
			throw e;
		} catch (Exception e) {
			DbUtils.rollback(connection);
			throw new ServiceException("ɾ�������Ϣ����", e);
			//e.printStackTrace();
		} finally {
			DbUtils.closeConnection(connection);
		}
			
		}
		
		
		
	
	}





