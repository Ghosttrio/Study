package com.game.rpg;

public class Tv {
	
	static final int MODEL_NUMBER = 1010;
	
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
		System.out.println("����ä��: "+ch);
	}
	void upCh() {
		this.ch = ch+1;
		System.out.println("����ä��: "+ch);
	}
	void downCh() {
		this.ch = ch-1;
		System.out.println("����ä��: "+ch);
	}
}
