package com.game.rpg;

public class Tv {
	
	boolean power;
	int ch;
	
	Tv(){
		power = false;
	}
	
	boolean on(boolean pow){
		pow = true;
		return pow;
	}
	
	void changCh(int ch) {
		this.ch = ch;
		System.out.println("현재채널: "+ch);
	}
	void upCh() {
		this.ch = ch+1;
		System.out.println("현재채널: "+ch);
	}
	void downCh() {
		this.ch = ch-1;
		System.out.println("현재채널: "+ch);
	}
}
