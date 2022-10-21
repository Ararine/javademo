package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.Vector;

/*
 * [프로그램 출력결과]
 * kim	56	78	12	146
 * hong	46	100	97	243
 * park	96	56	88	240
 */
public class Java183_Vector {

	public static void main(String[] args) {
		String path = "./src/java017_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);
	}//end main()
	
	
	private static Vector<Sawon> lines(String fileName){
		//strName 매개변수의 값을 이용해서 vector에 데이터를 저장한후
		//리턴하는 프로그램을 구현하시오.
//		File file = new File(fileName);
//		RandomAccessFile raf = null;
//		
//		try {
//			raf = new RandomAccessFile(file, "r");
//			String arr = "";
//			while(raf.getFilePointer() != raf.length()) {
//				arr += raf.readLine() + ' ';
//			}
//			
////			System.out.println(arr);
//			String[] array = arr.split("[\s:/]");
////			System.out.println(array.length);
//
//			Vector<Sawon> vt = new Vector<Sawon>();
//			
//			vt.add(new Sawon(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3])));
//			vt.add(new Sawon(array[4], Integer.parseInt(array[5]), Integer.parseInt(array[6]), Integer.parseInt(array[7])));
//			vt.add(new Sawon(array[8], Integer.parseInt(array[9]), Integer.parseInt(array[10]), Integer.parseInt(array[11])));
//					
//			return vt;
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Vector<Sawon> vt =new Vector<Sawon>();
		try(Scanner sc = new Scanner(new File(fileName))) {
			while(sc.hasNextLine()) {
				String[] data = sc.nextLine().split("[:/]");
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]));
				vt.add(sn);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vt;
	}//end lines()
	
	private static void prnDisplay(Vector<Sawon> vt) {
		//vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
//		for(int i=0; i<vt.size(); i++) {
//			System.out.print(vt.get(i));
//		}
		for(Sawon sn : vt) {
			System.out.println(sn.toString());
		}
	}//end prnDisplay()
}//end class
