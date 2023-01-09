package sec02.ex02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	public MemberDAO() {
		
		try {
			
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env"); // JNDI 사용을 위한 설정
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
//			dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle"); // 한번에 써도 됨
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public List<MemberVO> listMembers(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			this.con = dataFactory.getConnection();
			
			String query = "select * from t_member";
			
			pstmt = this.con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				
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
			this.pstmt.close();
			this.con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public void addMember(MemberVO vo) {
		try {
			String id = vo.getId();
			String pwd = vo.getPwd();
			String email = vo.getEmail();
			String name = vo.getName();
			
			con = dataFactory.getConnection();
			
			String query = " insert into t_member";
			query 		+= " (id, pwd, name, email)"; 
			query 		+= " values (?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			int result = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delMember(String id) {
		
		try {
			// DB 접속
			con = dataFactory.getConnection();
			
			// SQL 준비
			String query = " delete from t_member";
			query += 	   " where id = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			
			// SQL 실행
			int result = pstmt.executeUpdate();
			// 실행 결과 활용
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	public void upMember(MemberVO vo) {
		System.out.println("수정");
		try {
			String id = vo.getId();
			String pwd = vo.getPwd();
			String email = vo.getEmail();
			String name = vo.getName();
			
			con = dataFactory.getConnection();
			
			
			String query = " update t_member set pwd = ?, name = ?, email = ?";
			query += " where id = ?";
			
			pstmt = con.prepareStatement(query);
			
			
			pstmt.setString(1, pwd);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, id);
			
			int result = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
