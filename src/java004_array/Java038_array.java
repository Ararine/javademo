package java004_array;

public class Java038_array {

	public static void main(String[] args) {
		//javascript
		//let myArray = [1, 2, 3, "홍길동", "아무개"];
		
		//java
		int[] data = {10, 20, 30}; //배열은 리터널로 지정이 가능하다. 
		//javascript 와는 다르다. ex) let data = [10, 20, 30]
		//javascript 와는 다르게 여러 타입의 객체를 하나의 배열로 표현할 수 없다.
		
		//배열을 생성하면서 초기값을 설정해주면 배열의 크기를 지정할 수 없다.
		int[] jumsu = new int[] {90, 80, 40}; 
		
		for(int i = 0; i < data.length; i++) {
			System.out.printf("jumsu=[%d]=%d\n", i, jumsu[i]);
		}
		
		System.out.println("=====Reverse=====");
		for(int i = jumsu.length-1; i >= 0; i--) {
			System.out.printf("jumsu=[%d]=%d\n", i, jumsu[i]);
		}
	}
}
