package account01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/account")
public class AccountServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("	<style>");
		out.println("		th, td { ");
		out.println("			border: 1px solid black;");
		out.println("		}");
		out.println("	</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href='/pro07/inputForm.html'>입금</a>");
		out.println("<a href='/pro07/outputForm.html'>출금</a>");
		out.println("</body>");
		out.println("</html>");
				
		String a = request.getParameter("a");
		String c = request.getParameter("c");
		if(a != null && "b".equals(a)) {
			int m = Integer.parseInt(request.getParameter("i"));			
			AccountVO vo = new AccountVO();
			AccountDTO dto = new AccountDTO();
			dto.a(m);
			System.out.println(dto.q);
			
		} else if(c != null && "d".equals(c)) {
			int m = Integer.parseInt(request.getParameter("i"));
			System.out.println(m);
			
			AccountVO vo = new AccountVO();
			System.out.println(vo.getAll());
			int q = vo.getAll();
			q -= m;
			vo.setAll(q);
		}
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
