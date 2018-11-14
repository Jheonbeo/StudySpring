import springinf.Speaker;
import springinf.TV;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}
	
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리...");
	}
	
	public SamsungTV() {
		System.out.println("===> SamsungTV default 생성자");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice 호출");
		this.price = price;
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(Sony) 생성자");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(Sony, price) 생성자");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다. (가격 : " + price + ")");
	}
	
	public void powerOff(){
		System.out.println("SamsungTV--전원 끈다.");
	}
	
	public void volumeUp(){
		//System.out.println("SamsungTV--소리 올린다.");
		speaker.volumeUp();
	}
	
	public void volumeDown(){
		//System.out.println("SamsungTV--소리 내린다.");
		speaker.volumeDown();
	}
}
