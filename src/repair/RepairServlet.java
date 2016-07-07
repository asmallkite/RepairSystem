package repair;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import to_repair.To_Repair_Fun_Manage;
import to_repair.To_repair_stament;


public class RepairServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String service = request.getParameter("service");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		if(service == null || service.equals("")){
			System.out.println((new java.util.Date()).toLocaleString() + ":请求列出用户列表！");
		}else if(service.equals("add")){
			
			int repair_number = Integer.parseInt(request.getParameter("repair_number"));			
			String  repair_man = new String(request.getParameter("repair_man").getBytes("ISO-8859-1"),"utf-8");
			String repair_check_record = new String(request.getParameter("repair_check_record").getBytes("ISO-8859-1"),"utf-8");			
			String  repair_record = new String(request.getParameter("repair_record").getBytes("ISO-8859-1"),"utf-8");	
				
			String repair_check_time = new String(request.getParameter("repair_check_time").getBytes("ISO-8859-1"),"utf-8");
			
			String  repair_work_amount =new String(request.getParameter("repair_work_amount").getBytes("ISO-8859-1"),"utf-8");	
			
			String repair_use_device = new String(request.getParameter("repair_use_device").getBytes("ISO-8859-1"),"utf-8");
			String  repair_state = new String(request.getParameter("repair_state").getBytes("ISO-8859-1"),"utf-8");	
		
			Repair aRepair = new Repair(repair_number, repair_man, repair_check_record, repair_record
					,repair_check_time, repair_work_amount, repair_use_device, repair_state);
			
			RepairFunManage manage = RepairFunManage.getInstance();
			manage.insertRep(aRepair);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");
			
			dispatcher.forward(request, response);
		}else if(service.equals("find")){
			String get_number_tmp = request.getParameter("repair_number");
			int get_number = Integer.parseInt(get_number_tmp);
			System.out.println("传进servlet了~~~~~~~~~~~~~~~~~~~~~~~~~~");
			RepairFunManage manage = RepairFunManage.getInstance();
			Repair repairSta = manage.getRepByNo(get_number);
			request.setAttribute("to_and_to", repairSta);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Repair/FindRepair2.jsp");
			dispatcher.forward(request, response);
		}else if(service.equals("find2")){
RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");
			
			dispatcher.forward(request, response);
		}else if(service.equals("delete")){
			int get_number = Integer.parseInt(request.getParameter("repair_number"));
		
			RepairFunManage manage = RepairFunManage.getInstance();
			Repair a_re_sta = new Repair();
			a_re_sta = manage.getRepByNo(get_number);
			request.setAttribute("to_and_to", a_re_sta);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Repair/DeleteRepair2.jsp");
			dispatcher.forward(request, response);
			
		}else if(service.equals("delete2")){
			int get_number = Integer.parseInt(request.getParameter("repair_number2"));
			
			RepairFunManage manage = RepairFunManage.getInstance();
			manage.deleteRepByNo(get_number);
RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");
			
			dispatcher.forward(request, response);
			
		}else if(service.equals("update")){
			int get_number = Integer.parseInt(request.getParameter("repair_number"));
			
			RepairFunManage manage = RepairFunManage.getInstance();
			Repair a_re_sta = new Repair();
			a_re_sta = manage.getRepByNo(get_number);
			request.setAttribute("to_and_to", a_re_sta);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Repair/UpdateRepair2.jsp");
			dispatcher.forward(request, response);
		}else if(service.equals("update2")){
			int repair_number = Integer.parseInt(request.getParameter("repair_number"));			
			String  repair_man = new String(request.getParameter("repair_man").getBytes("ISO-8859-1"),"utf-8");
			String repair_check_record = new String(request.getParameter("repair_check_record").getBytes("ISO-8859-1"),"utf-8");			
			String  repair_record = new String(request.getParameter("repair_record").getBytes("ISO-8859-1"),"utf-8");	
				
			String repair_check_time = new String(request.getParameter("repair_check_time").getBytes("ISO-8859-1"),"utf-8");
			
			String  repair_work_amount =new String(request.getParameter("repair_work_amount").getBytes("ISO-8859-1"),"utf-8");	
			
			String repair_use_device = new String(request.getParameter("repair_use_device").getBytes("ISO-8859-1"),"utf-8");
			String  repair_state = new String(request.getParameter("repair_state").getBytes("ISO-8859-1"),"utf-8");	
		
			Repair aRepair = new Repair(repair_number, repair_man, repair_check_record, repair_record
					,repair_check_time, repair_work_amount, repair_use_device, repair_state);
			
			RepairFunManage manage = RepairFunManage.getInstance();
			
		
			manage.updateCouByNo(aRepair);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
