package chap08;

public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
//	���� ����
	public abstract void turnOn();
	public abstract void turnOff();
	
//	���� ����
	public abstract void volUp();
	public abstract void volDown();
	public abstract void setVol(int vol);
	
	default void setMute() {
		System.out.println("���Ұ� �մϴ�.");
	}
	
}