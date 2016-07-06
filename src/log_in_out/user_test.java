package log_in_out;

import log_in_out.Log_in_out;
import log_in_out.Log_in_out_manage;

public class user_test {
	public static void  main (String [] args){
		
		//测试成功
//		Log_in_out user = new Log_in_out("李争", "zheng");
//		Log_in_out_manage manage = Log_in_out_manage.getInstance();
//		manage.add_id_pw_manage(user);
		
		
		Log_in_out_manage manage = Log_in_out_manage.getInstance();
		Log_in_out user = new Log_in_out();
		user = manage.find_id_pw_manage("李争");
		System.out.println("info: " + user.getPassword());
	}
	
	

}
