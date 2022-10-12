package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
		class Area {
			int radius;
			String name;
			public double area() {
				return 3.14 * radius*radius;
			}
			
			void display() {
				System.out.println("자바" + name + "의 면적은 " + area());
			}
		}
		
		Area pizza = new Area();
		pizza.radius = 10;
		pizza.name = "피자";
		pizza.display();
		
		Area donut = new Area();
		donut.radius = 2;
		donut.name = "도넛";
		donut.display();
	}//end main()

}//end class
