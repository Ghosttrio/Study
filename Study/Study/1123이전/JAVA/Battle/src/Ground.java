
public class Ground {

	public static void main(String[] args) {
		Warrior conan = new Warrior(1000, 20);
		Soldier terminator = new Soldier(700, 30);
		
		while(true) {
			int n = conan.attack();
			terminator.damage(n);
			if(terminator.getHp()<=0) {
				System.out.println("Conan Won !!!");
				break;
			}
			n=terminator.attack();
			conan.damage(n);
			if(conan.getHp()<=0) {
				System.out.println("Terminator won !!!");
				break;
			}
		}
		System.out.println("Battle finished.");
	}

}
