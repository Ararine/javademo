package java011_casting_part01;

/*
 * 객체형변환 - 참조데이터 타입
 * 1. 상속관계일 때 형변환이 가능하다. (is a)
 * 2. 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
 * 	- 업캐스팅(up-casting) : 부모객체로 자식객체를 참조할 수 있도록 형변환하는 기술
 * 	- 다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
 */
public class Java109_casting {

	public static void main(String[] args) {
//		SampleA sa = new SampleA(); 
//		SampleB sb = new SampleB();
//		sa = (SampleA)sb; //SampleA 와 SampleB 는 독립적이기 때문에 오류가 발생
		
		Parent p = new Parent();
		Child c = new Child();
		
		p = c; //업캐스팅(up-casting) - 상속관계에서만 가능
		p.process();
		//p.call();
		
		//다운캐스팅(down-casting)
		Child d = (Child) p;
		
		//객체생성 및 업캐스팅
		Parent pt = new Child();
		pt.process();
//		pt.call();
		
		//다운캐스팅
		Child cn = (Child) pt;
		cn.call();
	}
}
