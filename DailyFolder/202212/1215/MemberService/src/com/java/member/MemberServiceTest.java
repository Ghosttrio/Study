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
		System.out.println("id�� password�� �Է��Ͻÿ�.");
		System.out.println("id:hong \npassword:12345");
		
		boolean result = memberService.login(s.nextLine(),s.nextLine());
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�?(Y/N)");
			String c = s.nextLine();
			if(c.equals("Y")) {
				memberService.logout("hong");
			}
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		System.out.println("---�߰�����---");
		
		memberService.doLogin();		
		
	}
}
