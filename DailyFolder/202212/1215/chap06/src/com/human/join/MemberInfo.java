package com.human.join;

public class MemberInfo {

	String id;
	String password;
	String tel;
	String address;
	
	MemberInfo(String id, String password){
		this.id = id;
		this.password = password;
	}
	MemberInfo(String id, String password, String tel, String address){
		this.tel = tel;
		this.address = address;
	}
	
// 메소드명 : toString
// 모든 필드의 내용을 이쁘게 표시
// 전달인자 : 없음
// 리턴타입 : String

	public String toString() {
		String temp = "";
		temp += "id : " + this.id;
		temp += "\npassword : " + this.password;
		temp += "\ntel : " + this.tel;
		temp += "\naddress : " + this.address;
		temp += "\n";
		return temp;
	}
//	오버라이딩
//	toString은 원래 있다.
//	덮어쓰는것
}

