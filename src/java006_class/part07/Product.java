package java006_class.part07;

/*
 * this : 객체 자신을 의미한다.
 * 1. this.멤버변수
 * 2. this.메소드()
 * 3. this(): 생성자
 */
public class Product {
	String code;
	String pname;
	int cnt;
	
	public Product() {
		//3
		this("p002", "식품", 3000); //아래 public Product(String code, String, int cnt) 호출
	}

	public Product(String code, String pname, int cnt) {
		//1
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}
	
	void display() {
		System.out.printf("%s %s %d\n", code, pname, cnt);
	}
	
	void prn() {
		//2
		this.display(); //this. 를 붙이지 않아도 내부적으로는 자동으로 붙임.
	}
	
}
