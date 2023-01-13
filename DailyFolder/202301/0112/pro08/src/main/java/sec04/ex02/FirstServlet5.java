package sec04.ex02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first5")
public class FirstServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("address", "Seoul Korea");
		
		response.getWriter().println("first5 Servlet");
		System.out.println("frist5 Servelt");
		
		RequestDispatcher dispatch = request.getRequestDispatcher("second5");
		dispatch.forward(request, response);
	}

}
