import java.util.Scanner;
 
public class Test16 {
 
    public static void main(String[] args) {
 
       Scanner s = new Scanner(System.in);
       
       int n = s.nextInt();
       int i=2;
       for(i=2; i<n; i++) {
    	   if(n%i==0) {
    		   break;
    	   }
       }
       if(i==n) {
    	   System.out.println("�Ҽ��Դϴ�.");
       }else {
    	   System.out.println("�Ҽ��� �ƴմϴ�.");
       }
    	  
       
    }
}
 