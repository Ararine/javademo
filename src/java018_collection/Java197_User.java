package java018_collection;

public class Java197_User {
	//제너릭을 통한 클래스 생성
	public static void main(String[] args) {
	Box<Integer> intBox = new Box<Integer>();
	intBox.setData(10);
	System.out.println(intBox.getData()); //10
	
	Box<String> strBox = new Box<String>("java");
	System.out.println(strBox.getData()); //java
	
	Box<Double> dleBox = new Box<Double>(4.5);
	System.out.println(dleBox.getData()); //4.5
	}//end main()
	
}//end class
