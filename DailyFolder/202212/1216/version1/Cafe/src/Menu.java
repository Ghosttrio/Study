
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	ArrayList<String> alName;
	ArrayList<Integer> alPrice;
	ArrayList<String> alName1;
	ArrayList<Integer> alPrice1;
	
// ▽초기화 ----------------------------------------------
	
	Menu(){
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		this.alName1 = new ArrayList<String>();
		this.alPrice1 = new ArrayList<Integer>();
		//file의 메뉴리스트를 읽어들인다.
		Scanner sMenu;
		try {
			sMenu = new Scanner(new File("c:\\data\\menu.txt"));
			
			while(sMenu.hasNextLine()) {
				String str = sMenu.nextLine();
				String[] arMenu = str.split(","); // ["Latte", "3200"]
				//this.alName.add(arMenu[0]);
				this.setName(arMenu[0]);
				this.setPrice(Integer.parseInt(arMenu[1]));
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
	// x를 누르면 저장
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
	
// ▽추가 -----------------------------------------------	
	
	void build() {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while(true) {
			System.out.print("메뉴를 입력하시오: ");
			String name = s1.nextLine();
			if(name.equals("")) break;
			System.out.print("가격을 입력하시오: ");
			this.setName(name);
			int price = s2.nextInt();
			this.setPrice(price);
			System.out.println();
		}
	}
	
// ▽삭제 -----------------------------------------------
	
	void delete() {
		Scanner s1 = new Scanner(System.in);
		
		while(true){
		System.out.print("메뉴번호를 입력하시오: ");
		String a = s1.nextLine();
		System.out.println();
		if(a.equals("")) break;
		int n = Integer.parseInt(a);
		this.alName.remove(n);
		this.alPrice.remove(n);
		}
	}
	
//	void delete() {
//		
//		Scanner s = new Scanner(System.in);
//		while(true) {
//			System.out.println("삭제할 메뉴번호를 입력하시오 ('':종료):");
//			String str = s.nextLine();
//			if(str.equals("")) break;
//			
//			int ndx=Integer.parseInt(str)-1;
//			this.alName.remove(ndx);
//			this.alPrice.remove(ndx);
//			this.display();
//			
//		}
//	}
	
// ▽수정 -----------------------------------------------
	
	void update() {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		System.out.print("메뉴번호를 입력하시오: ");
		int n = s1.nextInt();
		System.out.print("수정할 다른 메뉴이름을 입력하시오: ");
		String name = s2.nextLine();
		alName.set(n, name);
		System.out.print("수정할 금액을 입력하시오: ");
		int price = s3.nextInt();
		alPrice.set(n, price);
	}


// ▽매출관리 ---------------------------------------------
	
//	void sales() {
//		for(int i=0; i<this.alName1.size(); i++) {
//			System.out.println("\""+this.alName1.get(i)+"\"" + "의 매출 : " + this.alPrice1.get(i)+ "원");
//			}
//	}
	
// ▽메소드 ----------------------------------------------
	
	void display() {
		System.out.println("--------메뉴--------");
		for(int i=0; i<this.alName.size(); i++) {
		System.out.println(i+")  "+this.alName.get(i) + " ▷ " + this.alPrice.get(i)+"원");
		}
		System.out.println("-------------------");
	}
	
	void getName(int alName) {
		this.alName.get(alName);
	}
	
	void getPrice(int alPrice) {
		this.alPrice.get(alPrice);
		return;
	}
	
	void setName(String alName) {
		this.alName.add(alName);
	}
	
	void setPrice(int alPrice) {
		this.alPrice.add(alPrice);
	}
	

}
