package servlet;

import java.io.IOException;

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
@WebServlet("/FindCusServlet")
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
		
		int cus_number = Integer.parseInt(request.getParameter("customer_number"));
		
		CustomerFunManage customTest =null;
		Customer findCus = null;
		customTest = CustomerFunManage.getInstance();
		findCus = customTest.getCusByNo(cus_number);
		System.out.println("info:\n" + findCus.getCustomer_address() +"\n\n");
		request.setAttribute("findCus_another", findCus);
		RequestDispatcher dispatcher = request.getRequestDispatcher("../Custmer/findCus2.jsp");
		System.out.println("no 404\n\n" + findCus.getCustomer_contacts() +"\n\n");
		try {
			dispatcher.forward(request, response);
		}catch (java.lang.NullPointerException e){
			 System.out.println("NullPointerException: attribute expected in view");
		}
		System.out.println("no forwartd\n\n" + findCus.getCustomer_contacts() +"\n\n");
	}

}
