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
 * Servlet implementation class FindCusServlet
 */
@WebServlet("/FindCusServlet")
public class FindCusServlet extends HttpServlet {
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
		int cus_number = Integer.parseInt(request.getParameter("customer_number"));
		CustomerFunManage customTest =null;
		Customer findCus = null;
		customTest = CustomerFunManage.getInstance();
		findCus = customTest.getCusByNo(cus_number);
		request.setAttribute("findCus_another", findCus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Customer/findCus2.jsp");
		dispatcher.forward(request, response);
	}

}
