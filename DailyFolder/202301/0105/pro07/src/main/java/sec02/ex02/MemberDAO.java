package sec02.ex02;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import sec02.ex02.MemberVO;

public class MemberDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO() {

		try {
			Context ctx;
			ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env"); //jndi 사용하기 위한 설정
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle"); // 커넥션풀 사용법
		
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public List<MemberVO> listMembers(){
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
		
			this.con = dataFactory.getConnection();
			
			String query = "select * from t_member";
			System.out.println(query);
			

			pstmt = this.con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			

			
			while(rs.next()) {
				String id = rs.getString("id");
				System.out.println("id : " + id);
				
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joindate = rs.getDate("joindate");
				
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joindate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
//			커넥션 풀일때는 반환하는 의미로 바뀐다.
		} catch(Exception e) {
			e.printStackTrace();
//			에러날때 보여줌
		}
		return list;
	}
	
	public void addMember(MemberVO memberVO) {
		try {
			con = dataFactory.getConnection();
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			
			String query = " insert into t_member";
			query += " (id,pwd,name,email)";
			query += " values(?,?,?,?)";
			System.out.println("prepareStatement: " + query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
