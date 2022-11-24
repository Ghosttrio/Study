import java.util.Scanner;

public class Test7{
    
    public static void main(String[] args){
        
        Scanner c = new Scanner(System.in);
      
        System.out.print("First Number: ");
        int a=c.nextInt();
        System.out.print("First Number: ");
        int b=c.nextInt();
        System.out.println("a>b => "+(a>b));
        System.out.println("a<b => "+(a<b));
        System.out.println("a>=b => "+(a>=b));
        System.out.println("a<=b => "+(a<=b));
        
        c.close();
        
        
        }

}