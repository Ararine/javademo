package java020_thread.part06;

public class Bank implements Runnable{
	private AccountNumber an;
	
	public Bank() {

	}
	
	public Bank(AccountNumber an) {
		this.an = an;
	}
	@Override
	public void run() /*throws NumberFormatException*/{ //overriding 한 메소드에는 예외를 넘겨주는 처리를 해주면 나중에 오류가 발생한다.
		an.input();
		an.withDraw();
	}//end run()
	
}//end class
