package sec03.ex01;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/*2")
public class EncoderFilter extends HttpFilter implements Filter {
    ServletContext context;
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("utf-8 인코딩----------------");
		context = fConfig.getServletContext();
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter 호출");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String context = ((HttpServletRequest)request).getContextPath();
		String pathinfo = ((HttpServletRequest)request).getRequestURI();
		String realPath = request.getRealPath(pathinfo);
		String msg = " Context 정보: " + context + "\n URI 정보" + pathinfo + "\n 물리적 경로: " + realPath;
		System.out.println(msg);
		
		String isLogon =(String)((HttpServletRequest)request).getSession().getAttribute("isLogon");
		System.out.println("세션의 isLogon : " + isLogon);
		
		HttpSession session = null;
//		session = request.getSession(); X , 이건 부모인 ServletRequest에 없다
//		doFilter는 HttpServletRequest를 받지 않는다.
		if(request instanceof HttpServletRequest) {
			HttpServletRequest req = (HttpServletRequest) request;
			session = req.getSession();
			
//			key값 isLogon이 있으면 저장, 없으면 null 반환
			String loginInfo = (String) session.getAttribute("isLogon");
			if("true".equals(loginInfo)) {
				chain.doFilter(request, response);
			} else {
//				response.getWriter().println("로그인 해주세요");
				HttpServletResponse resp = (HttpServletResponse)response;
				resp.sendRedirect("/pro10/login.html");	
			}
		}
		// timestamp
		long start = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 ss.SSS초");
		String now = sdf.format(new Date());
		System.out.println(now);
		chain.doFilter(request, response);
		long end = System.currentTimeMillis();
		
		System.out.println("걸린시간[ms] : " + (end - start));
	}
	public void destroy() {
		System.out.println("destroy 호출");
	}
}
