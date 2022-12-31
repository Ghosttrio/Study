package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tt")
public class tt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet실행");
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		
		String[] listId = request.getParameterValues("id");
		for(int i=0; i<listId.length; i++) {
			System.out.println("아이디 : " + listId[i]);
		}
		
		response.setContentType("text/html; charset=utf-8;");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.print("<head>");
		out.print("</head>");
		out.println("<body>");
		out.println("아이디는 : " + id);
		out.println("</body>");
		out.println("</html>");
//	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
