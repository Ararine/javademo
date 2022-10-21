package java016_stream.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class practice {

	public static void main(String[] args) {
		File file = new File(".\\src\\java016_stream\\prob\\sun.txt");
		try {
			RandomAccessFile rf = new RandomAccessFile(file, "r");
			int cnt = 0;
			while(rf.readLine() != null) {
				cnt++;
			}
			System.out.println(cnt);
			rf.seek(0);
			String[] array = new String[3];
			for(int i=0; i< array.length; i++) {
				array[i]=rf.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
