import java.util.ArrayList;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> alName = new ArrayList<String>();
		
		while(true) {
			String name = s.nextLine();
			if(name.equals("")) break;
			
			alName.add(name);
			
		}
		showMembers(alName);
		

			System.out.print("���� ��ȣ�� �Է��Ͻÿ�:");
			Scanner s1 = new Scanner(System.in);
			int n = s1.nextInt();
			alName.remove(n);
		
		
		showMembers(alName);
		
		System.out.print("��ĥ ��ȣ�� �Է��Ͻÿ�: ");
		n = s1.nextInt();
		System.out.print("�� �̸��� �Է��Ͻÿ�: ");
		String name = s.nextLine();
		alName.set(n, name);
		
		showMembers(alName);
	}
	static void showMembers(ArrayList<String> alNick) {
		System.out.println("-----");
		System.out.println("�� "+alNick.size()+"��");
		System.out.println("-----");
		
		for(int i=0; i<alNick.size(); i++) {
			System.out.print(alNick.get(i)+" ");
		}
	}
	

}
