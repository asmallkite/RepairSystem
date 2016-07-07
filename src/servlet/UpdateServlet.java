package servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CustomerManage.Customer;
import CustomerManage.CustomerFunManage;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private int customer_number;
	 private String customer_id;
	 private Date customer_send_mac;
	 private String customer_nature;
	 private String customer_unit;
	 private String customer_tel;
	 private String customer_phone;
	 private String customer_address;
	 private String customer_postcode;
	 private String customer_contacts;
	 private String customer_email;
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
		customer_number = Integer.parseInt(request.getParameter("customer_number"));
		
		customer_id = request.getParameter("customer_id");
		//处理时间转换
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date newDate = null;
		try {
			newDate = sdf.parse(request.getParameter("customer_send_mac"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 customer_send_mac = new Date(newDate.getTime());
		
		customer_nature = request.getParameter("customer_nature");
		customer_unit = request.getParameter("customer_unit");
		customer_tel = request.getParameter("customer_tel");
		customer_phone = request.getParameter("customer_phone");
		customer_address = request.getParameter("customer_address");
		customer_postcode = request.getParameter("customer_postcode");
		customer_contacts = request.getParameter("customer_contacts");
		customer_email = request.getParameter("customer_email");
	
		//构造函数调用
		Customer customer01 = new Customer( customer_number,  customer_id,  customer_send_mac,
                  customer_nature,  customer_unit,  customer_tel,
                  customer_phone,  customer_address, customer_postcode,
                  customer_contacts,  customer_email);
//		System.out.println("info:\n" + customer.getCustomer_email() + "info:\n" +customer.getCustomer_unit());
		CustomerFunManage customTest =null;
		customTest = CustomerFunManage.getInstance();
		customTest.updateCusByNo(customer01);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");			
		dispatcher.forward(request, response);
		
		
	}

}
