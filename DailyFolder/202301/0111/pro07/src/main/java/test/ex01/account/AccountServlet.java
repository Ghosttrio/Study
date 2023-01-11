package test.ex01.account;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int balance = 0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");

		
		/*
		 	페이지 1 : 입금/출금 버튼이 있는 페이지
		 	페이지 2 : 입금 전용
		 	페이지 3 : 출금 전용
		 */
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		if( "in".equals(cmd) ) {
			
			System.out.println("입금 실행");
			
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("	<div style='width: 400px; margin: 20px auto; text-align: center;'>");
			out.println("		<form method='get' action='/pro07/AccountServlet'>");
			out.println("			입금 : <input type='text' name='money'>");
			out.println("			<input type='submit' value='입금하기'>");
			out.println("			<input type='hidden' name='cmd' value='api_in'>");
			out.println("		</form>");
			out.println("	</div>");
			out.println("</body>");
			out.println("</html>");
			
		} else if( "api_in".equals(cmd) ) {
			try {
				String money = request.getParameter("money");
				
				if(money != null) {
					// TODO 음수인지 검사
					this.balance += Integer.parseInt(money);
					
					out.println("<html>");
					out.println("<head>");
					out.println("</head>");
					out.println("<body>");
					out.println("	<div style='width: 200px; margin: 20px auto; text-align: center;'>");
					out.println("		정상적으로 입금 되었습니다<br>");
					out.println("		잔액 : "+ this.balance +"<br>");
					out.println("		<a href='/pro07/AccountServlet'>초기화면으로 가기</a><br>");
					out.println("	</div>");
					out.println("</body>");
					out.println("</html>");

				} else {
					out.println("입금 항목을 확인하세요");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				out.println("입금 항목을 확인하세요");
			}
		} else if( "out".equals(cmd) ) {
			
			System.out.println("출금 실행");
			
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("	<div style='width: 400px; margin: 20px auto; text-align: center;'>");
			out.println("		<form method='get' action='/pro07/AccountServlet'>");
			out.println("			출금 : <input type='text' name='money'>");
			out.println("			<input type='submit' value='출금하기'>");
			out.println("			<input type='hidden' name='cmd' value='api_out'>");
			out.println("		</form>");
			out.println("	</div>");
			out.println("</body>");
			out.println("</html>");

		} else if( "api_out".equals(cmd) ) {
			try {
				String money = request.getParameter("money");
				
				if(money != null) {
					
					int outMoney = Integer.parseInt(money);
					if(outMoney <= this.balance) {
						this.balance -= Integer.parseInt(money);
					}
					
					out.println("<html>");
					out.println("<head>");
					out.println("</head>");
					out.println("<body>");
					out.println("	<div style='width: 200px; margin: 20px auto; text-align: center;'>");
					if(outMoney <= this.balance) {
						out.println("		정상적으로 출금 되었습니다<br>");
					} else {
						out.println("		잔액이 부족합니다<br>");
					}
					out.println("		잔액 : "+ this.balance +"<br>");
					out.println("		<a href='/pro07/AccountServlet'>초기화면으로 가기</a><br>");
					out.println("	</div>");
					out.println("</body>");
					out.println("</html>");
						

				} else {
					out.println("입금 항목을 확인하세요");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				out.println("입금 항목을 확인하세요");
			}
		
		} else {
			
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("	<div style='width: 200px; margin: 20px auto; text-align: center;'>");
			out.println("		<a href='/pro07/AccountServlet?cmd=in'><button>입금</button></a>");
			out.println("		<button><a href='/pro07/AccountServlet?cmd=out'>출금</a></button>");
			out.println("	</div>");
			out.println("</body>");
			out.println("</html>");
			
		}
		
	}

}
