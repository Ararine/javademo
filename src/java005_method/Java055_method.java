package java005_method;

public class Java055_method {

	public static void main(String[] args) {
		int a = 4, b = 2, c = 5;
		int[] num = new int[] {2, 3};
		int[] data = new int[] {2, 6, 2, 8};
		
		System.out.println(process(a, b, c));
		//System.out.println(process2(a, b, c)); // argument 가 void 가 오는 경우 return 값이 존재하지 않기 때문에 오류가 발생한다.
		System.out.println(plus(num)); //참조데이터 타입의 경우 자동적으로 형변환이 일어나지 않으므로 매개변수와 인수의 데이터타입을 일치시켜줘야한다.
		System.out.println(plus(data));
		
	}//end main()
	
	public static int process(int x, int y, int z) {
		return x+y+z;
	}//end process()
	
	
	public static void process2(int x, int y, int z) {
		System.out.println(x+y+z);
	}//end process2()
	
	public static int plus(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}//end plus()
	
}//end class
