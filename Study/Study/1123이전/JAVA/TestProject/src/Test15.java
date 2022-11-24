import java.util.Scanner;
 
public class Test15 {
 
    public static void main(String[] args) {
 
       Scanner s = new Scanner(System.in);
       
       int n = s.nextInt();
       boolean a = false;
       
       for(int i=2; i<n; i++) {
    	   
    	   if(n%i==0) {
    		   a = true;
    		   break;
    	   }
       }
       if(a) {
    	   System.out.println("소수가 아닙니다.");
       }else {
    	   System.out.println("소수입니다.");
       }
    	  
       
    }
 
}