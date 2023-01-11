package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adad")
public class adad extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action=\"member\">");
		out.print("<table>");
		out.print("<th>회원정보수정창</th>");
		out.print("<tr>");
		out.print("<td>아이디</td>");
		out.print("<td><input type=\"text\" name=\"id\" value=\"" + id + "\" readonly></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>비밀번호</td>");
		out.print("<td><input type=\"password\" name=\"pwd\" value=\""+ pwd + "\"></td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>이름</td>");
		out.print("<td><input type=\"text\" name=\"name\" value=\"" + name + "\"></td>");
		out.print(" </tr>");
		out.print("<tr>");
		out.print("<td>이메일</td>");
		out.print("<td><input type=\"text\" name=\"email\" value=\"" + email + "\"></td>");
		out.print("</table>");
		out.print("<input type=\"button\" value=\"수정하기\" onclick=\"submit()\">");
		out.print("<input type=\"reset\" value=\"다시입력\">");
		out.print("<input type=\"hidden\" name=\"command\" value=\"upMember\"/>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
