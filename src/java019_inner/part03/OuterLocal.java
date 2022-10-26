package java019_inner.part03;

public class OuterLocal {
	private int x;
	static int y;
	final private int z = 10;
	
	public void call(/*final*/ int a) { //final이 붙어 있어야 내부클래스에서 사용이 가능하다. //새로운 값이 할당이 되지 않는다.
		final int b = 20;
		int c = 30;
//		a= 300; 
		//외부클래스에서 사용할 건지 내부클래스에서 사용할 건지 결정해야한다. 
		// 외부클래스에서 사용하는 매개변수를 주석처리해주면 자동으로 내부 클래스에서 
		//사용되는 매개변수는 final이 붙는다.
//		c= 500;
		//값을 변경하지 않으면 자동으로 final 붙어 내부클래스에서 사용이 가능하다.
		System.out.printf("a=%d\n", a);
		
		class InnerLocal {
			void prn() {
				x=5;
				y=150;
//				z=20;
				//내부클래스에서 외부클래스에서의 매개변수 및 자원을 사용할 수 있지만 final이
				//붙어 있어야 한다.
				//혹은 값의 변경이 없어야 한다.
				//즉, final 구조로 되어 있어야 한다.
				System.out.println("x=" +x);
				System.out.println("y=" +y);
				System.out.println("a=" +a);
				System.out.println("b=" +b);
				System.out.println("c=" +c);
			}//end prn()
		}//end InnerLocal class
		
		InnerLocal inner = new InnerLocal();
		inner.prn();
	}//end call()
	
}//end class
