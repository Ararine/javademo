package java011_casting_part04;

public class SamsungTv extends HomeTv{

	
	public SamsungTv() {
	
	}
	
	public SamsungTv(String maker) {
		this.maker = maker;
	}
	
	public void move() {
		System.out.println("Samsung move");
	}
}
