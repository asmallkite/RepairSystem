package repair;


public class Test {

	public static void main(String[] args) {
		//测试插入
//		RepairFunManage test_Manage = RepairFunManage.getInstance();
//		Repair repair01 = new Repair(1, "李振", "只","李振", "只", "ddfff" ,"ddff" ,"hihiijiajg" );
//		test_Manage.insertRep(repair01);
		
		
		
		//测试查询
//		RepairFunManage test_Manage = RepairFunManage.getInstance();
//	    Repair customer01 = null;
//	    customer01 = test_Manage.getRepByNo(1);
//	System.out.println("user info:\n" + customer01.getRepair_use_device());
//	System.out.println("user info:\n" );
//		
	//测试删除
		RepairFunManage test_Manage = RepairFunManage.getInstance();
		test_Manage.deleteRepByNo(12);
		//测试修改
//		RepairFunManage test_Manage = RepairFunManage.getInstance();
//		test_Manage.updateCouByNo(1);

}


}
