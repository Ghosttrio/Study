package com.game.rpg;

import java.util.Scanner;

public class TvControl {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Tv tv =new Tv();
		boolean power = false;
		power = tv.on(power);
		System.out.println("����ON");
		
		System.out.print("ä���� �Է��Ͻÿ�: ");
		tv.changCh(s.nextInt());
		System.out.print("ä���� �Է��Ͻÿ�(+/-): ");
		String a = s1.nextLine();
		if(a.equals("+")) {
			tv.upCh();
		} else if(a.equals("-")) {
			tv.downCh();
		}
	}
}
