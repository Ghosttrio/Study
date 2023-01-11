package account01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import sec02.ex02.MemberVO;

public class AccountDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	private int bank;
	
	public AccountDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env"); // JNDI 사용을 위한 설정
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
//	public void bank(int money) {
//		this.bank += money;
//	}
//	public int bank() {
//		return bank;
//	}
//	public void bank2(int money) {
//		this.bank -= money;
//	}
	
	
	public void fn_inMoney(int money) {
		try {
			con = dataFactory.getConnection();
			String query = " update t_money set money = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, money);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public void fn_outMoney(int money) {
		try {
			con = dataFactory.getConnection();
			String query = " update t_money set money = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, money);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int fn_resultMoney() {
		int id = 0;
		try {
			con = dataFactory.getConnection();
			String query = "select money from t_money";
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getInt("money");
			}
			pstmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
}
