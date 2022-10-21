package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

public class practice {

	public static void main(String[] args) {
		File file = new File("./src/java017_collection/score.txt");
		RandomAccessFile raf = null;
		
		try {
			raf = new RandomAccessFile(file, "r");
			String arr = "";
			while(raf.getFilePointer() != raf.length()) {
				arr += raf.readLine() + ' ';
			}
			
			System.out.println(arr);
			String[] array = arr.split("[\s:/]");
			System.out.println(array.length);

			Vector<Sawon> vt = new Vector<Sawon>();
			vt.add(new Sawon(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3])));
			vt.add(new Sawon(array[4], Integer.parseInt(array[5]), Integer.parseInt(array[6]), Integer.parseInt(array[7])));
			vt.add(new Sawon(array[8], Integer.parseInt(array[9]), Integer.parseInt(array[10]), Integer.parseInt(array[11])));
			
			System.out.println(vt.get(0));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
