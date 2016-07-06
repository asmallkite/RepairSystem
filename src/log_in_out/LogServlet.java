package log_in_out;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String service = request.getParameter("service");
		if(service == null || service.equals("")){
			System.out.println(  "请求为空");
		}else if(service.equals("add")){
			
		
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
		   
			
			String	userid = request.getParameter("userid");
			String pw = request.getParameter("psw");
			
			Log_in_out user = new Log_in_out(userid, pw);
			
		  Log_in_out_manage manager = Log_in_out_manage.getInstance();
		  manager.add_id_pw_manage(user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Customer/Test.jsp");			
			dispatcher.forward(request, response);
		}
		else if(service.equals("login")){
			
		
			
			response.setContentType("text/html;charset=UTF-8");
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			 Log_in_out_manage manager = Log_in_out_manage.getInstance();
			String input = request.getParameter("userid");
			Log_in_out user = new Log_in_out();
			
			user = manager.find_id_pw_manage(input);
			
			String input_pw = request.getParameter("psw");
			System.out.println(input_pw  + "\n" + user);
			if(user.getPassword() == input_pw){
				System.out.print("成功登陆");
			}else{
				System.out.print("账户与密码不匹配");
			
		}
			RequestDispatcher dispatcher = request.getRequestDispatcher("account/AccountInquire.jsp");			
			dispatcher.forward(request, response);
		
		
	}
	
	}

}
