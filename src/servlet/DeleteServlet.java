package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CustomerManage.Customer;
import CustomerManage.CustomerFunManage;

/**
 * Servlet implementation class DeleteServlet
 */
//@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int customer_number;
	CustomerFunManage FunMa = CustomerFunManage.getInstance();

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
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String cus_number_temp = request.getParameter("customer_number");
		
		int cus_number = Integer.parseInt(cus_number_temp);
		
		CustomerFunManage customTest = CustomerFunManage.getInstance();
		Customer findCus = null;
		findCus = customTest.getCusByNo(cus_number);
		
		request.setAttribute("findCus_another", findCus);
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/DeleCus2.jsp");
		
		dispatcher.forward(request, response);
		
		
//		customer_number = Integer.parseInt(request.getParameter("customer_number"));
//		FunMa.deleteCusByNo(customer_number);
//		
	}

}
