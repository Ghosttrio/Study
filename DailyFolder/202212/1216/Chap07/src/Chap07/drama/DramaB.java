package Chap07.drama;

public class DramaB extends Drama {
	
	DramaB(String title){
		this.title = title;
		System.out.println(getTitle() + " ����");
	}
//	--------------------------------------------------------
	
	@Override
	String sick(String type, int days) {
		if(type.equals(type) && days < 10) {
//			return type;
			return "�׳� �����Դϴ�.";
		} else {
//			return type;
			return "���� ���Դϴ�.";
		}
	}

//	--------------------------------------------------------

//	@Override
	boolean birthInfo(String origin, String now) {
		if(origin.equals(now)) {
			return true;
		} else {
			return false;
		}
	}
	
//	--------------------------------------------------------
	
//	@Override
	String revenge(int angry) {
		if(angry > 80) {
			String a = "��ġ�δ��";
			return a;
		} else {
			String b = "����";
			return b;
		
		}
	}

//	--------------------------------------------------------
	
//	@Override
	String triangle(int count) {
		
		if(count == 3) {
			return "�ﰢ����";
		} else {
			return "�ٰ�����";
		}
		
	}
}
