import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Url {

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
//		�ڷ� �˻��Ҷ�
		
		String y2 = "    y  e   s         ";
		System.out.println(y2.trim());
		
//		�α��ο� Ʈ��
		
		String searchKeyword = "   ";
		if(searchKeyword.trim().length() == 0) {
			System.out.println("���ڿ��Դϴ�. �Է����ּ���");
		}
		
		int count = countOf(url1, ".");
		System.out.println(count);
		
		
		System.out.println("--------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		
//		a.replace("", "");
		
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=90-35";
		
		String[] result1 = url.split("&|\\?");
		for(int i=0 ; i<result1.length; i++) {
			
			if(i==0) {
				System.out.println(result1[0]);
			}else {
				String q = result1[i].substring(0,result1[i].indexOf("="));
				String w = result1[i].substring(result1[i].indexOf("=")+1, result1[i].length());
				System.out.println(q + " : " + w);
			}
			if(result1[i].indexOf("query")==0) {
				System.out.println("�˻���� [" + result1[i].substring(result1[i].indexOf("=")+1, result1[i].length()) + "] �Դϴ�");
			}
			
		}
	
		String url3 = "naver.com";
		url3 += "qqq";
		url3 += "asdq";
		
	
		StringBuffer sb = new StringBuffer();
		sb.append("naver.com");
		sb.append("qqq");
		sb.append("asdq");
		
		String temp = sb.toString();
		System.out.println(temp);
	
	
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String now = sdf.format(date);
		System.out.println(now);
		
		Calendar time = Calendar.getInstance();
		
		time.add(Calendar.DATE, 20);
		int y = time.get(Calendar.YEAR);
		System.out.println(y);
		
		int m = time.get(Calendar.MONTH)+ 1;
		System.out.println(m);
		
		int dd = time.get(Calendar.DATE);
		System.out.println(dd);
	}
	
//	static String Url(String url) {
//		String result = "";
//		String[] result1 = url.split("?|&");
//		for(int i=0; i<url.length(); i++) {
//			System.out.println(result1[i]);
//		}
//		
//		
//		
//		
//		return result;
//	}
	
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
