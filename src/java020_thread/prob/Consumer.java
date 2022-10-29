package java020_thread.prob;

public class Consumer extends Thread{
	private VendingMachine vm;
	private String who;
	public Consumer() {
	}
	
	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}
	
	public Consumer(VendingMachine vm, String who) {
		this.vm = vm;
		this.who = who;
	}
	
	@Override
	public void run() {
		if(this.who == "생산자") {			
		for(int i=1; i<=10; i++) {
				System.out.printf("%s : 음료수 No. %d 자판기에 넣기", this.who, i);												
			}
		}else if(this.who == "판매자") {
			for(int i=1; i<=10; i++) {
				System.out.printf("%s : 음료수 No. %d 꺼내먹기", this.who, i);
		}vm.putDrink(who);
	}
	}
}
