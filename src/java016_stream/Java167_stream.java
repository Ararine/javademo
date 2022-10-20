package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java167_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		
		FileReader fr = null;
		int data;
		
		try {
			fr = new FileReader(file);
//			System.out.println(file.length());
//			for(long i =0; i<file.length(); i++) {
//				System.out.print((char)fr.read());
//			}
			//read() : 파일의 끝일 때 -1을 리턴한다. // int 값이다.
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
