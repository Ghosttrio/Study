package chap08;

public class Tv implements RemoteControl {

	private int volume = 0;
	private boolean power = false;
	
	@Override
	public void turnOn() {
		System.out.println("tv�� �մϴ�.");
		this.power = true;
	}
	@Override
	public void turnOff() {
		System.out.println("tv�� ���ϴ�.");
		this.power = false;
	}
	@Override
	public void volUp() {
//		����� ���� ������ STATIC�� �°� ����ϴ°� ����.
//		int a = this.MAX_VOLUMN;
		
		if(volume >= RemoteControl.MAX_VOLUME) {
			System.out.println("tv�� ������ �ִ�ġ�Դϴ�.");
		} else {
			volume++;
			System.out.println("tv�� ������ �ϳ� �ø��ϴ�.");	
			System.out.println(this.volume);
		}
	}
	@Override
	public void volDown() {
		if(volume <= RemoteControl.MIN_VOLUME) {
			System.out.println("tv�� ������ �ּ��Դϴ�.");
		} else {
			volume--;
			System.out.println("tv�� ������ �ϳ� �����ϴ�. ");
			System.out.println(this.volume);
		}
	}
	@Override
	public void setVol(int vol) {
//		�Է°��� ������ ����� �ʵ��� ����
//		���� ��� 14�� �ԷµǸ� 10���� ����
//		-3�� �ԷµǸ� 0���� ����
		if(vol>RemoteControl.MAX_VOLUME) {
			vol = RemoteControl.MAX_VOLUME;
		} else if(vol <RemoteControl.MIN_VOLUME) {
			vol = RemoteControl.MIN_VOLUME;
		} 
		this.volume = vol;
		System.out.println("tv�� ������ " + this.volume + "�� �����մϴ�.");
	}
	
	@Override
	public void setMute() {
		this.volume = 0;
		System.out.println("���Ұ�");
	}
}
