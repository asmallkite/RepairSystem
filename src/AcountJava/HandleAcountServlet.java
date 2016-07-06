package AcountJava;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import AcountJava.CountFunManage;
import AcountJava.Count;


public class HandleAcountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String service = request.getParameter("service");
		if(service == null || service.equals("")){
			System.out.println((new java.util.Date()).toLocaleString() + "请求为空");
		}else if(service.equals("add")){
			
		
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
		    int	se_repair_number = Integer.parseInt(request.getParameter("se_repair_number"));
			System.out.println("the attention:\n\n\n" + request.getParameter("se_repair_number"));
			String	se_repair_cast = request.getParameter("se_repair_cast");
			String se_material_cast = request.getParameter("se_material_cast");
			String se_attention = request.getParameter("se_attention");
			String se_time = request.getParameter("se_time");
			
		
		
			Count count = new Count( 	
					 se_repair_number,
					  se_repair_cast,
					 se_material_cast,
					 se_attention,
					 se_time);
			
		   CountFunManage countTest = CountFunManage.getInstance();
			countTest.insertCou(count);
			RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterAccount.jsp");			
			dispatcher.forward(request, response);
		}
		else if(service.equals("inquiry")){
			
		
			
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			  int	se_repair_number = Integer.parseInt(request.getParameter("se_repair_number"));
			CountFunManage countTest = CountFunManage.getInstance();
			Count findCou = null;
			findCou = countTest.getCouByNo(se_repair_number);
			request.setAttribute("findCou_another", findCou);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Count/AccountInquire1.jsp");
			dispatcher.forward(request, response);		
		
		}
		
		else if(service.equals("delete")){	
			CountFunManage customTest = CountFunManage.getInstance();
			int customer_number = Integer.parseInt(request.getParameter("se_repair_number"));
			customTest.deleteCouByNo(customer_number);		
		
		}
	}
	
	
	
	

}
