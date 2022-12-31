package com.java.member;

import java.util.Scanner;

public class MemberServiceTest {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		Scanner s1 = new Scanner(System.in);

//		String b = s.nextLine();
//		MemberService memberService = new MemberService();
//		
//		memberservice.login(, );
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		
		MemberService memberService = new MemberService();
		System.out.println("id와 password를 입력하시오.");
		System.out.println("id:hong \npassword:12345");
		
		boolean result = memberService.login(s.nextLine(),s.nextLine());
		if(result) {
			System.out.println("로그인 되었습니다.");
			System.out.println("로그아웃 하시겠습니까?(Y/N)");
			String c = s.nextLine();
			if(c.equals("Y")) {
				memberService.logout("hong");
			}
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		System.out.println("---추가문제---");
		
		memberService.doLogin();		
		
	}
}
