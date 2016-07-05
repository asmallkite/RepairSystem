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
 * Servlet implementation class UpdateServlet2
 */

public class UpdateServlet2 extends HttpServlet {
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
		String cus_number_temp = request.getParameter("customer_number");
		System.out.println("输出获取的字符诶型 编号");
		int cus_number = Integer.parseInt(cus_number_temp);
		CustomerFunManage customTest = CustomerFunManage.getInstance();
		Customer findCus = null;
		findCus = customTest.getCusByNo(cus_number);
		System.out.println("执行玩查找工作`````········......");
		request.setAttribute("findCus_another", findCus);
		System.out.println("执行玩setAttribute········......");
		RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/update2.jsp");
		System.out.println("执行玩RequestDispatcher dispatcher = request.getRequestDispatcher......");
		dispatcher.forward(request, response);
		System.out.println("执行wanbi  你成功了····················");
	}

}
