package chap10;

public class StringTest {

	public static void main(String[] args) {

		String str = "�����̻���";
		char a = str.charAt(3);
		System.out.println(a);
		
		int b = str.indexOf("��");
		System.out.println(b);
		b = str.indexOf("���");
		System.out.println(b);
		b = str.indexOf("�ɳ�");
		System.out.println(b);
		
		String url1 = "blog.naver41541.com";
		String url2 = "cafe.naver.com";
	
		if(url1.indexOf("cafe") == -1) {
			System.out.println("url�� cage�� �ƴմϴ�.");
		}
		if(url1.indexOf("cafe") >= 0) {
			System.out.println("url�� blog �Դϴ�.");
		}
	
		int idx = url1.indexOf(".");
		System.out.println(idx);
//		indexOf�� ���������� ���ڿ��� ���� ó�� ������ ��ġ�� �����ش� (���ϴ� ���� ã���� break)
		
		System.out.println(url1.substring(5));
		System.out.println(url1.substring(5,7));
		
//		url1���� ù ��° ���� �� ��° �� ������ ���� ���
//		�� "."�� indexOf, substring �̿��ؼ�
		
		int d = url1.indexOf(".")+1;
		int e = url1.substring(d).indexOf(".");
		System.out.println(url1.substring(d,e));

		String y1 = "Yes";
		if( y1.toLowerCase().equals("YeS".toLowerCase()) ) {
			System.out.println("����");
		}
//	�ڷ� �˻��Ҷ�
		
		String y2 = "    y  e   s         ";
		System.out.println(y2.trim());
		
//		�α��ο� Ʈ��
		
		String searchKeyword = "   ";
		if(searchKeyword.trim().length() == 0) {
			System.out.println("���ڿ��Դϴ�. �Է����ּ���");
		}
		
		int count = countOf(url1, ".");
		System.out.println(count);
		
	}
	
//	str�� keyword�� ��ִ��� Ȯ��
	
	static int countOf(String str, String keyword) {
		int result = 0;
		for(int i=0; i<str.length(); i++) {
			String a = String.valueOf(str.charAt(i));
//			String a = str.charAt(i)+"";
			if(a.equals(keyword)) {
				result++;
			}
		}
		
//		byte[] items = str.getBytes();
//		for(int i=0; i<items.length; i++) {
//			
//		}
		
		
		return result;
	}
	

}
