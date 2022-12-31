package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		System.out.println(userId + ", " + userPw);
		
		response.setContentType("text/html; charset=utf-8");
//		html로 인식해라 ; meta정보
		
		PrintWriter out = response.getWriter();
		
		String data = "<html>";
		data += "<head>";
		data += "</head>";
		data += "<body>";
		data += "	아이디 : " + userId;
		data += "	<br>";
		data += "	비밀번호 : " + userPw;
		data += "</body>";
		data += "</html>";
		
		out.println(data);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
