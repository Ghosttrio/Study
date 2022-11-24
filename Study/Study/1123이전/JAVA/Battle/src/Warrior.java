
public class Warrior {
	
	int hp;
	int ap;
	
	public int getHp() {
		return hp;
	}

	public int getAp() {
		return ap;
	}
	
	Warrior(int hp, int ap){
		this.hp = hp;
		this.ap = ap;
		System.out.println("Warrior HP = "+this.hp+", AP = "+this.ap);
	}
	
	int attack() {
		int k = (int)(Math.random()*this.ap+1);
		System.out.println("Warrior Attack power = "+ k);
		return k;
	}
	void damage(int n) {
		hp=hp-n;
		System.out.println("Warrior Left : " + this.hp);
	}
}
