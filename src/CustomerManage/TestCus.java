package CustomerManage;

public class TestCus {
	public static void main(String[] args) {
		CustomFun customTest = new CustomFunImpl();
		Customer customer01 = null;
		customer01 = customTest.getCusByNo(1);
		System.out.println("user info:\n" + customer01.getCustomer_address());
	    }

}
