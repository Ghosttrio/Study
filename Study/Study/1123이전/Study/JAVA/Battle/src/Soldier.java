
public class Soldier {

	int hp; // 체력
	int ap; // 최대공격력
	
	public int getHp() {
		return hp;
	}

	public int getAp() {
		return ap;
	}

	Soldier(int hp, int ap){
		this.hp = hp;
		this.ap = ap;
		System.out.println("Soldier HP = "+this.hp+", AP = "+this.ap);
	}
	
	int attack() {
		int k = (int)(Math.random()*this.ap+1);
		System.out.println("Solider Attack power = "+ k);
		return k;
	}
	void damage(int n) {
		hp=hp-n;
		System.out.println("Soldier Left : " + this.hp);
	}
}
