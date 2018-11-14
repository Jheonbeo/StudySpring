import springinf.Speaker;
import springinf.TV;

public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��..");
	}
	
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��...");
	}
	
	public SamsungTV() {
		System.out.println("===> SamsungTV default ������");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice ȣ��");
		this.price = price;
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(Sony) ������");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(Sony, price) ������");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV--���� �Ҵ�. (���� : " + price + ")");
	}
	
	public void powerOff(){
		System.out.println("SamsungTV--���� ����.");
	}
	
	public void volumeUp(){
		//System.out.println("SamsungTV--�Ҹ� �ø���.");
		speaker.volumeUp();
	}
	
	public void volumeDown(){
		//System.out.println("SamsungTV--�Ҹ� ������.");
		speaker.volumeDown();
	}
}
