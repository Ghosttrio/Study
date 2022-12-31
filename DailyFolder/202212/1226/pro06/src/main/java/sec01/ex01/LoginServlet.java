package sec01.ex01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginServlet doGet 실행");
		
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPw);
	
//		String[] ids = request.getParameterValues("user_id");
//		for(String id : ids) {
//			System.out.println("아이디 : " + id);
//		}
		
//		첫 번째 name에 해당하는 값만 가져온다.
		System.out.println(request.getParameter("subject"));
		String[] subjects = request.getParameterValues("subject");
		if(subjects != null) {
			for(String subject : subjects) {
				System.out.println("subject : " + subject);
			}
		} else {
			System.out.println("선택한 내용이 없습니다.");
		}
		
		Enumeration<String> en = request.getParameterNames();
		while(en.hasMoreElements()) { // 다음 요소가 있는가?
			String name = en.nextElement(); // 다음 요소 가져오기
			System.out.println("name : " + name); // 확보한 name 값 출력
			
			String[] values = request.getParameterValues(name); // name값을 이용해서 value들 조회
			for(int i=0; i<values.length; i++) {
				System.out.println(name + " : " + values[i]);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 실행");
		doGet(request, response);
	}

}
