package java007_class.answ.part02;

import java007_class.answ.part01.MovieShop;

public class Practice {
	public static void main(String[] args) {
		int sum = 0;
		MovieShop[] ms = new MovieShop[3];
		ms[0] = new MovieShop("연평해전", 7000, 2);
		ms[1] = new MovieShop("극비수사", 7500, 3);
		ms[2] = new MovieShop("소수의견", 7000, 2);
		
		for(int i=0; i<ms.length; i++) {
			ms[i].prn();
			sum += ms[i].countMoney();
		}
		System.out.println("총합계: " + sum);
	}
}
