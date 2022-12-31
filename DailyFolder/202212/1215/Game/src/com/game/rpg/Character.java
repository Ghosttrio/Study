package com.game.rpg;

// 전사 케릭터
public class Character {

	// 필드 : 상태 또는 값을 저장한다
	// 	-체력
	int hp = 100;
	// 	-방어력
	int dp = 5;
	// 	-공격력
	int ap = 30;
	
	// 메소드 : 정해진 순서 따른 행동
	// 	-공격
	// 전달인자 : 없음
	// 리턴타입 : 공격 숫자를 돌려줌
	int attack() {
		int rand = (int)(Math.random()*5) - 2; // -2 ~ 2 랜덤
		int result = ap + rand;
		return result;
	}
	// 	-도망
	// 전달인자 : 없음
	// 리턴타입 : 성공 여부 t/f
	boolean escape() {
		int rand = (int)(Math.random()*2); // 0~1
		if(rand == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	// 	-귀환
	// 전달인자 : 없음
	// 리턴타입 : 없음
	void goHome() {
		System.out.println("집에 갑니다");
	}
	
	//  -이동
	// 전달인자 : 거리
	// 리턴타입 : 없음
	void move(int m) {
		System.out.println(m +"만큼 이동합니다");
	}
	
	//  -공격 받기
	// 전달인자 : 때리는 수치
	// 리턴타입 : 남은 체력
	int hit(int n) {
		this.hp = this.hp - (n - this.dp);
		return this.hp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
