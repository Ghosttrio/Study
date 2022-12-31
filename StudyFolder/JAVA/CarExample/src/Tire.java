
public class Tire {

	int maxRotation;
	// 최대회전수
	int accumulatedRotation;
	// 누적회전수
	String location;
	// 장착위치
	
	Tire(String loc, int max){
		this.location = loc;
		this.maxRotation = max;
		this.accumulatedRotation = 0;
	}
	
	boolean roll() {
		++this.accumulatedRotation;
		if(this.accumulatedRotation<maxRotation) {
			System.out.println("Tire's left Rotate:"+ (this.maxRotation-this.accumulatedRotation) + " rounds");
			return true;
		} else {
			System.out.println(this.location + "Tire punk");
			return false;
		}
	}
	
}
