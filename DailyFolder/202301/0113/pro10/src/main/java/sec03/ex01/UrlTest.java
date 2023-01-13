package sec03.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/url/test2")
public class UrlTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// http://localhost:8080/pro10/url/test?num=123&name=abc
		
//		요청 url
		StringBuffer url = request.getRequestURL();
		System.out.println("getRequestURL : " + url);
		
//		서버 주소를 제외한 주소
		String uri = request.getRequestURI();
		System.out.println("getRequestURI : " + url);
		
//		어플리케이션 경로
		String ctxPath = request.getContextPath();
		System.out.println("getContextPath : " + ctxPath);
		
//		서블릿 경로
		String srvPath = request.getServletPath();
		System.out.println("getServletPath : " + srvPath);
		
//		요청 매개변수(쿼리스트링)
		String qs = request.getQueryString();
		System.out.println("getQueryString : " + qs);
		
	}
}
