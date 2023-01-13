package sec03.ex011;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UrlTest
 */
@WebServlet("/url/test")
public class UrlTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// http://127.0.0.1:8080/pro10/url/test?num=123&name=abc
		
		// 요청 url
		StringBuffer url = request.getRequestURL();
		System.out.println("getRequestURL : "+ url);
		
		// 서버 주소를 제외한 주소
		String uri = request.getRequestURI();
		System.out.println("getRequestURI : "+ uri);
		
		// 어플리케이션(컨텍스트) 경로
		String ctxPath = request.getContextPath();
		System.out.println("getContextPath : "+ ctxPath);
		
		// 서블릿 경로
		String srvParh = request.getServletPath();
		System.out.println("getServletPath : "+ srvParh);
		
		// 요청 파라메터(쿼리 스트링)
		String qs = request.getQueryString();
		System.out.println("getQueryString : "+ qs);
		
	}

}
