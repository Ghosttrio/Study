package com.game.rpg;

import java.util.Scanner;

public class TvControl {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Tv tv =new Tv();
		boolean power = false;
		power = tv.on(power);
		System.out.println("전원ON");
		
		System.out.print("채널을 입력하시오: ");
		tv.changCh(s.nextInt());
		System.out.print("채널을 입력하시오(+/-): ");
		String a = s1.nextLine();
		if(a.equals("+")) {
			tv.upCh();
		} else if(a.equals("-")) {
			tv.downCh();
		}
	}
}
