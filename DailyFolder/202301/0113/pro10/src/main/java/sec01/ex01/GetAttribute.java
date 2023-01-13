package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class GetAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		ServletContext ctx = getServletContext();
		String ctxMesg = (String)ctx.getAttribute("context");
		String sesMesg = (String)ctx.getAttribute("session");
		String reqMesg = (String)ctx.getAttribute("request");
	
	}

}
