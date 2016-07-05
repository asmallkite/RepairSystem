package to_repair;

public class Test_to_repair {
	public static void main(String[] args){
		
		//插入测试
//		To_Repair_Fun_Manage test_fun_Manage = null;
//		test_fun_Manage = To_Repair_Fun_Manage.getInstance();
//		To_repair_stament to_repair_stament = new To_repair_stament("lizheng",
//				"rr","ff","ww","cc","rr","ff","ww","cc","rr","ff","ww","cc"
//				,"rr","ff","ww","cc","rr","ff","ww","cc");
//		test_fun_Manage.insertToRepair(to_repair_stament);
		//删除测试
//		To_Repair_Fun_Manage test_fun_Manage = null;
//		test_fun_Manage = To_Repair_Fun_Manage.getInstance();
//		test_fun_Manage.deleteToRepairByNo("ff");
		//c查询测试
		To_Repair_Fun_Manage test_fun_Manage = null;
		test_fun_Manage = To_Repair_Fun_Manage.getInstance();
		To_repair_stament a = null;
		a = test_fun_Manage.getToRepairByNo("lizheng");
		System.out.print(a.getCustomer_number() + "成功了················");
	}
	


}
