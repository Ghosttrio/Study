package sec03.ex011;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class EncodeFilter
 */
@WebFilter("/*")
public class EncodeFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public EncodeFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("doFilter 실행");
		
		// 반복해야 하는 작업을 한번에
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");

		// 권한 점검
//		String isLogon = (String) ((HttpServletRequest)request).getSession().getAttribute("isLogon");
//		System.out.println("세션의 isLogon : "+ isLogon);
		// 자세하게
		// request.getSession(); getSession은 부모인 ServletRequest에 없음
		HttpSession session = null;
		if(request instanceof HttpServletRequest) {
			HttpServletRequest req = (HttpServletRequest) request;
			
			StringBuffer sb = req.getRequestURL();
			String url = sb.toString();
			System.out.println("url : "+ url);
			
			System.out.println("indexOf : "+ url.indexOf("/login") );
			if(url.indexOf("/login") != -1
				|| url.indexOf("/url/test") != -1
				|| url.indexOf("/login3") != -1
				|| url.indexOf("/login4") != -1
				|| url.indexOf("/api/") != -1
				) {
				// 통과
				
				// 서블릿 동작
				chain.doFilter(request, response);
			} else {
				// 세션 점검
				session = req.getSession();
				
				// key값 isLogon이 없으면 null 반환
				String loginInfo = (String) session.getAttribute("isLogon");
				if("OK".equals(loginInfo)) {
					// 개발자 편의를 위한
					// timestamp
					long start = System.currentTimeMillis();

					SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss.SSS초");
//					String now = sdf.format(new Date());
					String now = sdf.format(start);
					System.out.println(now);
					
					// 서블릿 동작
					chain.doFilter(request, response);
					
					long end = System.currentTimeMillis();
					System.out.println("걸린시간[ms] : "+ (end - start));
				} else {
//					response.getWriter().println("<div>로그인해주세요</div>");
					HttpServletResponse resp = (HttpServletResponse) response;
					resp.sendRedirect("/pro10/login.html");
				}
			}

			
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
