package chap08;

public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
//	전원 조작
	public abstract void turnOn();
	public abstract void turnOff();
	
//	볼륨 조작
	public abstract void volUp();
	public abstract void volDown();
	public abstract void setVol(int vol);
	
	default void setMute() {
		System.out.println("음소거 합니다.");
	}
	
}