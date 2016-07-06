package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CustomerManage.CustomerFunManage;

/**
 * Servlet implementation class DeleteServlet
 */
//@WebServlet("/deleteServlet2")
public class DeleteServlet2 extends HttpServlet {
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
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		CustomerFunManage customTest = CustomerFunManage.getInstance();
		int customer_number = Integer.parseInt(request.getParameter("customer_number"));
		customTest.deleteCusByNo(customer_number);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
