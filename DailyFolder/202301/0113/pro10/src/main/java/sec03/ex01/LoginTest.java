package sec03.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginTest2")
public class LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("user_name");
		System.out.println(name);
		response.getWriter().write("name: " + name);
		
//		try {
//			Thread.sleep(2*1000);
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		StringBuffer sb = request.getRequestURL();
		String url = sb.toString();
		if(url.indexOf("/login")!=-1) {
			//통과
		} else {
			//세션 점검
		}
		
		
		request.getSession().setAttribute("isLogon", "true");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
