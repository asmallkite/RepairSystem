package AcountJava;

	import java.text.ParseException;
import java.text.SimpleDateFormat;


	
@SuppressWarnings("unused")
public class Test {
	
		public static void main(String[] args) {
			
		//	测试添加成功
//			CountFunManage test = CountFunManage.getInstance();
//			Count count = new Count(6, "d", "dd", "d", "dd");
//			test.insertCou(count);
			//	测试查询成功
//			CountFunManage test = CountFunManage.getInstance();
//		    Count customer01 = null;
//		    customer01 = test.getCouByNo(6);
//		System.out.println("user info:\n" + customer01.getSe_repair_cast());
//			System.out.println("user info:\n" );
//			测试update
//			CountFunManage test = CountFunManage.getInstance();
//			test.updateCouByNo(6);
			//测试删除
			CountFunManage test = CountFunManage.getInstance();
			test.deleteCouByNo(0);
			
	
	}


}
