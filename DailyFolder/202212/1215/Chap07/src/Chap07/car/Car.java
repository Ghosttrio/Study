package Chap07.car;

public class Car {
	
	int speed; // �ӵ�
	int gas; // �⸧
	boolean power; //�õ�
	
	Car(){
		this.gas = 0;
		this.power = false;
	}
	
//	�õ�
	void boot(int gas, boolean power) {
		this.gas = gas;
		this.power = power;
	}
	
//	����
	void Drive() {
		System.out.println("�����մϴ�");
	}
	
//	����
	void Reverse() {
		System.out.println("�����մϴ�");
	}
	
//	����
	void Stop() {
		System.out.println("�����մϴ�");
	}
	
//	�õ�����
	
	
}
