package sec03.ex011;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainTest
 */
@WebServlet("/main")
public class MainTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/* 
		// filter로 옮김
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");

		
		String loginInfo = (String) request.getSession().getAttribute("isLogon");
		if(!"OK".equals(loginInfo)) {
//			response.getWriter().println("<div>로그인해주세요</div>");
			HttpServletResponse resp = (HttpServletResponse) response;
			resp.sendRedirect("/pro10/login.html");
			return;
		}
		*/
		
		System.out.println("프라이빗한 공간에 잘 왔습니다");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
