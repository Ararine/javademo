package java020_thread.prob;

public class Producer extends Thread{
	private VendingMachine vm;
	private String who;
	public Producer(VendingMachine vm) {
		this.vm = vm;
	}
	public Producer(VendingMachine vm, String who) {
		this.vm = vm;
		this.who = who;
	}
	
	@Override
	public void run() {
		vm.putDrink(who);
	}
}
