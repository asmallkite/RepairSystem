package Spare;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SuppressWarnings("unused")

public class Test2 {
	
		public static void main(String[] args) {
			//插入测试
//			SpareFunManage manage = SpareFunManage.getInstance();
//			Spare a_spare = new Spare("螺丝刀", "001", 2, "mei ", "dder", 5);
//			manage.insertSpa(a_spare);
			//查询测试成功
//			SpareFunManage manage = SpareFunManage.getInstance();
//			Spare a_spare = new Spare();
//			a_spare = manage.getSpaByNo("螺丝刀");
//		System.out.println("user info:\n" + a_spare.getSpare_alert_count());
		
//			System.out.println("user info:\n" );
		 //删除测试
			SpareFunManage manage = SpareFunManage.getInstance();
			manage.deleteSpaByNo("螺丝刀");
			
			
			
			

	
	}


}