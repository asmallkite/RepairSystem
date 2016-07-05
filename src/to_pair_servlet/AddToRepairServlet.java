package to_pair_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import to_repair.To_Repair_Fun_Manage;
import to_repair.To_repair_stament;


public class AddToRepairServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String service = request.getParameter("service");
		if(service == null || service.equals("")){
			System.out.println((new java.util.Date()).toLocaleString() + ":请求列出用户列表！");
		}else if(service.equals("add")){
			
		
			String to_repair_number = request.getParameter("to_repair_number");
			String  customer_number = request.getParameter("customer_number");
			String to_repair_product_type = request.getParameter("to_repair_product_type");
			String  to_repair_mac_brand = request.getParameter("to_repair_mac_brand");
			String to_repair_mac_type = request.getParameter("to_repair_mac_type");
			String  to_repair_serial = request.getParameter("to_repair_serial");
			String to_repair_lack_part = request.getParameter("to_repair_lack_part");
			String  to_repair_trouble_phen = request.getParameter("to_repair_trouble_phen");
			String to_repair_trouble_type = request.getParameter("to_repair_trouble_type");
			String to_repair_facial_check = request.getParameter("to_repair_facial_check");
			String  to_repair_start_cmd = request.getParameter("to_repair_start_cmd");
			String to_repair_impo_files = request.getParameter("to_repair_impo_files");
			String  to_repair_hdd = request.getParameter("to_repair_hdd");
			String to_repair_pc = request.getParameter("to_repair_pc");
			String  to_repair_ac = request.getParameter("to_repair_ac");
			String to_repair_battery = request.getParameter("to_repair_battery");
			String  to_repair_cd_driver = request.getParameter("to_repair_cd_driver");
			String  to_repair_floppy = request.getParameter("to_repair_floppy");
			String to_repair_time = request.getParameter("to_repair_time");
			String  to_repair_price = request.getParameter("to_repair_price");
			String to_repair_state = request.getParameter("to_repair_state");
			To_repair_stament a_to_repair_sta = new  To_repair_stament( to_repair_number,  customer_number,
					 to_repair_product_type,  to_repair_mac_brand,
					 to_repair_mac_type,  to_repair_serial,
					 to_repair_lack_part,  to_repair_trouble_phen,
					 to_repair_trouble_type,  to_repair_facial_check,
					 to_repair_start_cmd,  to_repair_impo_files,
					 to_repair_hdd,  to_repair_pc,  to_repair_ac,
					 to_repair_battery,  to_repair_cd_driver,
					 to_repair_floppy,  to_repair_time,
					 to_repair_price,  to_repair_state);
			
			To_Repair_Fun_Manage to_Repair_Fun_Manage = To_Repair_Fun_Manage.getInstance();
			to_Repair_Fun_Manage.insertToRepair(a_to_repair_sta);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");
			
			dispatcher.forward(request, response);
		}
		
	}

}
