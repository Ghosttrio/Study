public class Test12 {
	public static void main(String[] args) {
		
		String str = "Hello World";
		String str1 = "";
		for(int i=10; i>=0; i--) {
			str1 += str.substring(i,i+1);
		}
		System.out.println(str1);
		
	}
}
