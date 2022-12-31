package chap08;

public class RemoteControlTest {

	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.volUp();
		tv.volUp();
		tv.volDown();
		tv.setVol(12);
		tv.setVol(-12);
		tv.setVol(5);
		tv.volUp();
		
		SmartTv tvtv = new SmartTv();
		tvtv.search("¹Ùº¸");
	
		Searchable searchable = tvtv;
		search("ÈÞ¸Õ", searchable);
		search("ÈÞ¸Õ", tvtv);
		
	}

	
	static void search(String key, Searchable s) {
		s.search(key);
	}
	
}
