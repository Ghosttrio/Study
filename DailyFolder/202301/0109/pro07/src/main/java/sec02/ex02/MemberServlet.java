package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");

		MemberDAO dao = new MemberDAO();
		
		String command = request.getParameter("command");
		
		// 회원 추가
		if(command != null && "addMember".equals(command)) {
			// 전달 받음
			String _id = request.getParameter("id");
			String _pwd = request.getParameter("pwd");
			String _name = request.getParameter("name");
			String _email = request.getParameter("email");
			
			// vo 클래스에 저장
			MemberVO vo = new MemberVO();
			vo.setId(_id);
			vo.setPwd(_pwd);
			vo.setName(_name);
			vo.setEmail(_email);
			
			// 회원 추가 메소드 실행
			dao.addMember(vo);
		} else if(command != null && command.equals("delMember")){
			String id = request.getParameter("id");
			dao.delMember(id);
			
		} else if(command != null && command.equals("upMember")){
			
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			
			MemberVO vo = new MemberVO();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setEmail(email);
			
			
			dao.upMember(vo);
	
		} 
		
		
		List<MemberVO> list = dao.listMembers();
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("	<style>");
		out.println("		th, td { ");
		out.println("			border: 1px solid black;");
		out.println("		}");
		out.println("	</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table>");
		out.println("	<tr>");
		out.println("		<th>아이디</th>");
		out.println("		<th>비밀번호</th>");
		out.println("		<th>이름</th>");
		out.println("		<th>이메일</th>");
		out.println("		<th>가입일</th>");
		out.println("		<th>삭제</th>");
		out.println("		<th>수정</th>");
		out.println("	</tr>");
		
		for(int i=0; i<list.size(); i++) {
			MemberVO vo = list.get(i);
			
			String id = vo.getId();
			String pwd = vo.getPwd();
			String name = vo.getName();
			String email = vo.getEmail();
			Date joinDate = vo.getJoinDate();
			
			out.println("<tr>");
			out.println("	<td>"+ id +"</td>");
			out.println("	<td>"+ pwd +"</td>");
			out.println("	<td>"+ name +"</td>");
			out.println("	<td>"+ email +"</td>");
			out.println("	<td>"+ joinDate +"</td>");
			out.println("	<td><a href=\"/pro07/member?command=delMember&id="+ id +"\">삭제</a></td>");
			out.println("   <td><a href='/pro07/adad?id="+id+"&pwd="+pwd+"&name="+name+"&email="+email+"\"'>수정</a></td>");
			out.println("</tr>");

		}
		out.println("</table>");
		
		out.println("<a href='/pro07/memberForm.html'>새 회원 등록하기</a>");
		
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
		
		
	}

}
