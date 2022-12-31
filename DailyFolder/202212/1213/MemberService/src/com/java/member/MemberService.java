package com.java.member;

public class MemberService {

//	String id;
//	String pw;
//	
//	MemberService(){
//		this.id = "hong";
//		this.pw = "qkqk";
//	}
//	
//	void login(String id, String pw) {
//		if (this.id == id && this.pw == pw) {
//			System.out.println("로그인");
//		} else {
//			System.out.println("로그인 정보를 확인하시오");
//		}
//	}
	
	
	String id;
	String pw;
	
	MemberService(){
		
	}
	
	boolean login(String id, String pw) {
		if(id=="hong" && pw=="12345") {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 하셨습니다.");
	}
	

}
