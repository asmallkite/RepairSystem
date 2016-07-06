package Spare;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HandleSpaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String service = request.getParameter("service");
		if(service == null || service.equals("")){
			System.out.println((new java.util.Date()).toLocaleString() + ":�����г��û��б?");
		}else if(service.equals("add")){
			
		
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
		    String	spare_name = request.getParameter("spare_name");
			
			String	spare_typw = request.getParameter("spare_typw");
		    int	 spare_count = Integer.parseInt(request.getParameter("spare_count"));
			String spare_price= request.getParameter("spare_price");
			String spare_to_lib_time = request.getParameter("spare_to_lib_time");
		    int	spare_alert_count= Integer.parseInt(request.getParameter("spare_alert_count"));
			Spare spare = new Spare( 	
					spare_name,
					 spare_typw,
					spare_count,
					spare_price,
					 spare_to_lib_time,
					spare_alert_count
					);
			
		   SpareFunManage spareTest = SpareFunManage.getInstance();
			spareTest.insertSpa(spare);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");			
			dispatcher.forward(request, response);
		}
		else if(service.equals("find")){
				
			  String spare_name = request.getParameter("spare_name");
			SpareFunManage countTest = SpareFunManage.getInstance();
			Spare findSpa = null;
			findSpa= countTest.getSpaByNo(spare_name);
			request.setAttribute("findSpa_another", findSpa);
			RequestDispatcher dispatcher = request.getRequestDispatcher("spare/SpareInquire1.jsp");
			dispatcher.forward(request, response);		
		
		}
		
		else if(service.equals("delete")){	
			 String spare_name = request.getParameter("spare_name");
				SpareFunManage countTest = SpareFunManage.getInstance();
				Spare findSpa = null;
				findSpa= countTest.getSpaByNo(spare_name);
				request.setAttribute("findSpa_another", findSpa);
				RequestDispatcher dispatcher = request.getRequestDispatcher("spare/SpareDelete1.jsp");
				dispatcher.forward(request, response);	
				
			
		
		}else if(service.equals("delete2")){
			SpareFunManage customTest = SpareFunManage.getInstance();
			  String	spare_name = request.getParameter("spare_name");
			customTest.deleteSpaByNo(spare_name);		
			RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");			
			dispatcher.forward(request, response);
		}
	}
	
	
	
	

}
