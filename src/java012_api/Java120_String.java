package java012_api;

/*
 * [출력결과]
 * << 첫 번째 메시지 >> 
 * 제품 아이디 : PROD-00001
 * 제품명 : iPhone4
 * 가격 : 940000
 * 수량 : 4
 * 제조자 : 애플
 * << 두 번째 메시지 >>
 * 메시지 형식이 잘못되었습니다.
 * 메시지는 제품아이디:제품명:가격:수량:제조사 형식이어야 합니다.
 */
public class Java120_String {

	public static void main(String[] args) {
		System.out.println("<< 첫 번째 메시지 >>");
		handleMessage("PROD-00001:iPhone4:940000:4:애플");
		System.out.println("<< 두 번째 메시지 >>");
		handleMessage("PROD-00002:갤럭시S:960000:삼성");
	}//end main()

	private static void handleMessage(String sn) {
		//제품아이디, 제품명, 가격, 수량, 제조사를 출력하는 프로그램을 구현하시오.
		String[] arr = sn.split(":");
		if(arr.length == 5) {
			System.out.printf("제품 아이디 : %s\n제품명 : %s\n가격 : %s\n수량 : %s\n제조자 : %s\n", arr[0], arr[1], arr[2], arr[3], arr[4] );
		}else System.out.printf("메시지 형식이 잘못되었습니다.\n메시지는 제품아이디:제품명:가격:수량:제조사 형식이어야 합니다.");
		
	}
}//end class
