package java019_inner.part04;

public class OuterAnonymous {
	private int x;
	
	InnerAnonymous ta = new InnerAnonymous() { //단 한번만 사용이 가능하다.
		
		void prn() {
			System.out.println("prn");
		}
	};
	
	public void display() {
		//방법1
		ta.prn();
		
		//방법2
		new InnerAnonymous() {
			@Override
			void prn() {
				System.out.println("prn2");
			}
		}.prn();
	}
}
