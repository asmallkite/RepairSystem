package CustomerManage;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestCus {
	public static void main(String[] args) {
		CustomerFunManage customTest = CustomerFunManage.getInstance();
//		Customer customer01 = null;
//		customer01 = customTest.getCusByNo(2);
//		System.out.println("user info:\n" + customer01.getCustomer_address() + customer01.getCustomer_contacts());
		
		
		String date = "2016-10-05";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date newDate = null;
		try {
			newDate = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		java.sql.Date sqlStartDate = new java.sql.Date(newDate.getTime());
		Customer customer02= new Customer(2,"410728199502066512",sqlStartDate, "单位用户", "华科", 
				"03738986548", "13437195758", "河南省新乡市","453400", "李zheng", "1064844142@qq.com");
		customTest.updateCusByNo(customer02);
//		Customer customer01 = null;
//		customer01 = customTest.getCusByNo(1);
//		System.out.println("user info:\n" + customer01.getCustomer_address());
		
//		customTest.deleteCusByNo(2);
		

}
}
