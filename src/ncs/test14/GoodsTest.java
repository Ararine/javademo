package ncs.test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GoodsTest {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		Goods goods = new Goods();
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		
		try{
			br = new BufferedReader(isr);
			System.out.println("다음 항목의 값을 입력하시오.");
			System.out.print("상품명 :");
			String gName = br.readLine();
			System.out.printf("가격 :");
			int gPrice = Integer.parseInt(br.readLine());
			System.out.printf("수량 :");
			int gQuantity = Integer.parseInt(br.readLine());
			goods = new Goods(gName, gPrice, gQuantity);
			
			System.out.println("입력된 결과는 다음과 같습니다.");
			System.out.println(goods.toString());
			System.out.printf("총 구매 가격 : %d 원\n", goods.getPrice() * goods.getQuantity());
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			br.close();
			isr.close();
			is.close();
			} catch (IOException e) {
				e.toString();
			}
		}
	}
}
