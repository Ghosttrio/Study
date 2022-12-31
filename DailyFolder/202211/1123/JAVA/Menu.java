
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

//���ʱ�ȭ--------------------------------------------------------------
	
	ArrayList<String> alName;
	ArrayList<Integer> alPrice;
	ArrayList<String> alName1;
	ArrayList<Integer> alPrice1;

	Menu(){
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		
		this.alName1 = new ArrayList<String>();
		this.alPrice1 = new ArrayList<Integer>();

		Scanner sMenu;
		try {
			sMenu = new Scanner(new File("c:\\data\\menu.txt"));
			while(sMenu.hasNextLine()) {
				String str = sMenu.nextLine();
				String[] arMenu = str.split(",");
				this.setName(arMenu[0]);
				this.setPrice(Integer.parseInt(arMenu[1]));
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
// ������----------------------------------------------------------
	
	void save() {
		try {
			File file = new File("c:\\data\\menu.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			PrintWriter writer = new PrintWriter(fw);
			for(int i=0; i<this.alName.size(); i++) {
				String str = this.alName.get(i)+","+this.alPrice.get(i)+"\n";
				writer.write(str);
			}
			writer.close();
		}	catch (IOException e){
			e.printStackTrace();
		}
	}
	
// ���߰� -----------------------------------------------	
	
	void build() {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while(true) {
			System.out.print("�޴��� �Է��Ͻÿ�: ");
			String name = s1.nextLine();
			if(name.equals("")) break;
			System.out.print("������ �Է��Ͻÿ�: ");
			this.setName(name);
			int price = s2.nextInt();
			this.setPrice(price);
			System.out.println();
		}
	}
	
// ����� -----------------------------------------------
	
	void delete() {
		Scanner s1 = new Scanner(System.in);
		
		while(true){
			System.out.print("�޴���ȣ�� �Է��Ͻÿ�: ");
			String a = s1.nextLine();
			if(a.equals("")) break;
			int n = Integer.parseInt(a);
			this.alName.remove(n);
			this.alPrice.remove(n);
		}
	}

// ����� -----------------------------------------------
	
	void update() {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		System.out.print("�޴���ȣ�� �Է��Ͻÿ�: ");
		int n = s1.nextInt();
		System.out.print("������ �ٸ� �޴��̸��� �Է��Ͻÿ�: ");
		String name = s2.nextLine();
		alName.set(n, name);
		System.out.print("������ �ݾ��� �Է��Ͻÿ�: ");
		int price = s3.nextInt();
		alPrice.set(n, price);
	}
	
// ��޼ҵ� ----------------------------------------------
	
	void display() {
		System.out.println("--------�޴�--------");
		for(int i=0; i<this.alName.size(); i++) {
		System.out.println(i+")  "+this.alName.get(i) + " �� " + this.alPrice.get(i)+"��");
		}
		System.out.println("-------------------");
	}
	
	void setName(String alName) {
		this.alName.add(alName);
	}
	
	void setPrice(int alPrice) {
		this.alPrice.add(alPrice);
	}
	
}
