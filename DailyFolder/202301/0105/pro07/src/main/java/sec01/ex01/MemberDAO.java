package sec01.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@todair.synology.me:51521:xe";
//  데이터베이스 주소							   @~Host주소:포트:xe
	private String user = "scott3_17";
	private String pwd = "tiger";
	   
	private Statement stmt;
	private Connection con;
	
	private void connDB() {		
		try {
//	String변수 driver를 이용해서 class를 생성한다.
//			OracleDriver od = new OracleDriver(); <--- 이렇게 적어도 됨
//			변수에 담아두면 바꾸기 쉽다.
			Class.forName(this.driver);
			System.out.println("Oracle 드라이버 로딩 성공");
//	DB접속		
			this.con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
//	SQL 실행 변수 생성
			this.stmt = this.con.createStatement();
			System.out.println("Statement 생성 성공");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<MemberVO> listMembers(){
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			connDB();
			String query = "select * from t_member";
			System.out.println(query);
			
//			executeQuery를 이용하여 sql 실행
//			결과를 ResultSet 타입으로 돌려줌
			
			
//			1.
//			ResultSet rs = this.stmt.executeQuery(query);
			
//			2.PreparedStatement를 사용하면 더빠르고 ? 를 사용할 수 있다.
			PreparedStatement pstmt = this.con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
//			rs.next(); // 첫번째 줄로 커서를 이동
//			String id = rs.getString("id");
//			System.out.println("id 컬럼의 값 : " + id);
//			
//			rs.next(); //다음줄
//			String name = rs.getString("name");
//			System.out.println("두번째 줄의 name : " + name);
			
			
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
			stmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
//			에러날때 보여줌
		}
		
		
		
		return list;
		
	}
	

}
