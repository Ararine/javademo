package java020_thread.part06;

public class java217_thread {

	public static void main(String[] args) {
		AccountNumber an = new AccountNumber();
		
		Bank bank = new Bank(an);
		Thread aPoint = new Thread(bank, "A지점");
		aPoint.start();
		
		Thread bPoint = new Thread(bank, "B지점");
		bPoint.start();
	}//end main()
}//end class
