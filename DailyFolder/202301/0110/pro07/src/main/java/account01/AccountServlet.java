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
		AccountDAO dao = new AccountDAO();
		String a = request.getParameter("inMoney");
		if(a==null) {
			a = "0";
		}
		int inMoney = Integer.parseInt(a);
		int outMoney = Integer.parseInt(a);
		
		// 저장하는 메소드를 하나 만들자
		
//		dao.bank(inMoney);
//		dao.bank2(outMoney);
//		
//		
//		System.out.println(dao.bank());
//		dao.fn_inMoney(dao.bank());
//		dao.fn_outMoney(dao.bank());
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("	<style>");
		out.println("		a { ");
		out.println("			font-size:30px;");
		out.println("		}");
		out.println("	</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href='/pro07/inputForm.html'>입금</a>");
		out.println("<a href='/pro07/outputForm.html'>출금</a>");
		out.println("<br>");
		out.println("잔액 : " + dao.fn_resultMoney());
		out.println("</body>");
		out.println("</html>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
