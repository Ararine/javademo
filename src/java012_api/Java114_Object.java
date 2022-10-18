package java012_api;

/*
 * JAVA API(Application Programming Interface)
 * Object
 * 1. 클래스 중에서 최상의 클래스이다.
 * 2. Object을 제외한 모든 클래스들은 Object을 상속받고 있다.
 * 3. java.lang 패키지에서 제공하는 클래스이다.
 */
public class Java114_Object {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		int x = 5;
		int y = 5;
		//값비교(기본 데이터 타입)
		System.out.printf("x=%d, y=%d, x==y:%b\n", x, y, x==y); //x=5, y=5, x==y:true
		
		Object ojt = new Object();
		//주소비교(참조 데이터 타입)
		System.out.printf("obj==ojt:%b\n", obj==ojt); //obj==ojt:false
		
		//equals() : 주소비교 = 객체비교만 가능하다.
		System.out.printf("obj.equals(ojt):%b\n", obj.equals(ojt)); //obj.equals(ojt):false
		
		//getClass() : 클래스 리턴 //class java.lang.Object
		System.out.println(obj.getClass());
		
		//getName() : 클래스를 제외한 요소 리턴 //java.lang.Object
		System.out.println(obj.getClass().getName());
		
		//hashCode() : 데이터타입은 int이며 해쉬코드값을 리턴해준다.
		int num = obj.hashCode();
		System.out.println(num); //2104457164
	}
}
