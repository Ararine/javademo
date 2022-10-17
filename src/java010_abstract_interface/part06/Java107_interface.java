package java010_abstract_interface.part06;

/*
 * -(private) +(public) *(protected)
 * class와 interface를 이용하여 성적처리
 * 
 * 인터페이스명 : Score
 * +sol:int (초기값:20)
 * +getScore():int
 * 
 * 인터페이스명 : Print
 * +toPrint():String
 * 
 * 클래스명 : User
 * -name:String
 * +User()
 * +User(name:String)
 * +toString():String
 * 
 * 클래스명 : UserTest 에 위에서 정의한 클래스, 인터페이스 상속받음
 * [출력화면]
 * 이름:홍길동
 * 점수:60점
 */
public class Java107_interface {

	public static void main(String[] args) {
		//다음과 같이 실행했을 때 [출력화면]을 참조하여 구현하세요.
		UserTest ut = new UserTest("홍길동", 3);
		System.out.println(ut.toPrint());
	}
}
