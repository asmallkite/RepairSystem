package CustomerManage;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestCus {
	public static void main(String[] args) {
		CustomFun customTest = new CustomFunImpl();
//		Customer customer01 = null;
//		customer01 = customTest.getCusByNo(1);
//		System.out.println("user info:\n" + customer01.getCustomer_address());
		
		
//		String date = "2010-1-2";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		java.util.Date newDate = null;
//		try {
//			newDate = sdf.parse(date);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		java.sql.Date sqlStartDate = new java.sql.Date(newDate.getTime());
//		Customer customer02= new Customer(2,"410728155669874",sqlStartDate, "商户", "阿里", "阿里", "阿里", "阿里","阿里", "阿里", "阿里");
//		customTest.insertCus(customer02);
//		Customer customer01 = null;
//		customer01 = customTest.getCusByNo(2);
//		System.out.println("user info:\n" + customer01.getCustomer_address());
		
		customTest.deleteCusByNo(1);
		

}
}
