package account01;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import sec02.ex02.MemberVO;

public class AccountDTO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	public void upMoney(MemberVO vo) {
		System.out.println("수정");
		try {
			AccountVO vo = new AccountVO();
			int money = vo.getAll();
			
			
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
