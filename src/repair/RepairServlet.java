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
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		if(service == null || service.equals("")){
			System.out.println((new java.util.Date()).toLocaleString() + ":请求列出用户列表！");
		}else if(service.equals("add")){
			
			int repair_number = Integer.parseInt(request.getParameter("repair_number"));			
			String  repair_man = request.getParameter("repair_man");			
			String repair_check_record = request.getParameter("repair_check_record");			
			String  repair_record = request.getParameter("repair_record");
			
			String repair_check_time = request.getParameter("repair_check_time");			
			String  repair_work_amount = request.getParameter("repair_work_amount");			
			String repair_use_device = request.getParameter("repair_use_device");
			String  repair_state = request.getParameter("repair_state");
		
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
			String get_number = request.getParameter("repair_number");
			System.out.println("传进servlet了~~~~~~~~~~~~~~~~~~~~~~~~~~");
			To_Repair_Fun_Manage to_Repair_Fun_Manage = To_Repair_Fun_Manage.getInstance();
			To_repair_stament a_re_sta = to_Repair_Fun_Manage.getToRepairByNo(get_number);
			request.setAttribute("to_and_to", a_re_sta);
			RequestDispatcher dispatcher = request.getRequestDispatcher("ToRepair/UpdateToRepair2.jsp");
			dispatcher.forward(request, response);
		}else if(service.equals("update2")){
			System.out.println("update2222222222222222222222");
//			String get_number = request.getParameter("repair_number");
//			To_Repair_Fun_Manage to_Repair_Fun_Manage = To_Repair_Fun_Manage.getInstance();
//			to_Repair_Fun_Manage.updateCusByNo(get_number);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");
//			dispatcher.forward(request, response);
		}
		
	}

}
