package chap08;

public class SmartTv implements RemoteControl, Searchable, Mine {

	@Override
	public void search(String keyword) {
		System.out.println("구글에서 "+keyword+"를 검색합니다...");

	}


	private int volume = 0;
	private boolean power = false;
	
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
		this.power = true;
	}
	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
		this.power = false;
	}
	@Override
	public void volUp() {
//		사용할 수는 있지만 STATIC에 맞게 사용하는게 좋다.
//		int a = this.MAX_VOLUMN;
		
		if(volume >= RemoteControl.MAX_VOLUME) {
			System.out.println("tv의 볼륨이 최대치입니다.");
		} else {
			volume++;
			System.out.println("tv의 볼륨을 하나 올립니다.");	
			System.out.println(this.volume);
		}
	}
	@Override
	public void volDown() {
		if(volume <= RemoteControl.MIN_VOLUME) {
			System.out.println("tv의 볼륨이 최소입니다.");
		} else {
			volume--;
			System.out.println("tv의 볼륨을 하나 내립니다. ");
			System.out.println(this.volume);
		}
	}
	@Override
	public void setVol(int vol) {
//		입력값이 범위를 벗어나지 않도록 변경
//		예를 들어 14가 입력되면 10으로 적용
//		-3이 입력되면 0으로 적용
		if(vol>RemoteControl.MAX_VOLUME) {
			vol = RemoteControl.MAX_VOLUME;
		} else if(vol <RemoteControl.MIN_VOLUME) {
			vol = RemoteControl.MIN_VOLUME;
		} 
		this.volume = vol;
		System.out.println("tv의 볼륨을 " + this.volume + "로 변경합니다.");
	}
	
	@Override
	public void setMute() {
		this.volume = 0;
		System.out.println("음소거");
	}

}
