package com.human.join;

public class MemberJoin {

	public static void main(String[] args) {
		
		MemberInfo info = new MemberInfo("admin", "admin2");
		info.tel = "010-1234-5678";
		info.address = "충남 천안시";
		String str = info.toString();
		System.out.println(str);
		
		MemberInfo info2 = new MemberInfo("root", "1234", "010-1234", "경기도 평택시");
		System.out.println(info2.toString());
	}
}
