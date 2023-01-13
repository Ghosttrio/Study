package sec05.ex01;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("get terminated");
		ServletContext context = getServletContext();

		List memberList = (List) context.getAttribute("member");
		System.out.println("memberList : " + memberList);
		
		if(memberList != null) {
			System.out.println(memberList.get(0));
			System.out.println(memberList.get(1));
			System.out.println(memberList.get(2));
		}
		
	}
}

