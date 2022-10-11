package java005_method;

public class Java063_method {

	public static void main(String[] args) {
		int[] num = new int[] {5,2,8,7,4};
		System.out.printf("최대값:%d\n", max(num)); //8
		System.out.printf("최소값:%d\n", min(num)); //2
		System.out.printf("배열의 크기:%d\n", size(num)); //5
	}//end main()
	
	//최대값
	public static int max(int[] arr) {
		
		int num = arr[0];
		for(int i=1 ; i < arr.length; i++) {
			if(num < arr[i]) num = arr[i];
		}
		
		return num;
	}//end max()
	
	//최소값
	public static int min(int[] arr) {
		int num = arr[0];
		for(int i=1; i < arr.length; i++) {
			if(num > arr[i]) num = arr[i];
		}
		return num;
	}//end min()
	
	
	//배열의 크기
	public static int size(int[] arr) {
		
		return arr.length;
	}//end size()
	
}//end class
