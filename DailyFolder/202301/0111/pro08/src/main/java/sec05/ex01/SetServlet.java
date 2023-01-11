package sec05.ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetServlet")
public class SetServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("set terminated");
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		ServletContext context = getServletContext();
		context.setAttribute("member", list);
		
	}
}
