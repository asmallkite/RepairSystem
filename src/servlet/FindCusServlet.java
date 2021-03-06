package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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
public class FindCusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

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
		System.out.println("FIndCusServlet is starting now   at DdoPost  获取的值是" + cus_number_temp );
		int cus_number = Integer.parseInt(cus_number_temp);
		System.out.println("FIndCusServlet is starting now   at DdoPost  获取的值是   int 类型" + cus_number_temp );
		CustomerFunManage customTest = CustomerFunManage.getInstance();
		Customer findCus = null;
		findCus = customTest.getCusByNo(cus_number);
//		System.out.println("执行玩查找工作`````········......");
		request.setAttribute("findCus_another", findCus);
//		System.out.println("执行玩setAttribute········......");
		RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/FindCus2.jsp");
//		System.out.println("执行玩RequestDispatcher dispatcher = request.getRequestDispatcher......");
		dispatcher.forward(request, response);
//		System.out.println("执行wanbi  你成功了····················");
		
	
		
		}
	
	}

