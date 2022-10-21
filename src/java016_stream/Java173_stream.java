package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java173_stream {
	//File class - createNewFile() 파일 생성
	public static void main(String[] args) {
		File file = new File("src/java016_stream/text.txt");
		if(!file.exists()) {
			try {
				file.createNewFile(); //파일 생성
				System.out.println("파일 생성");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("파일 존재");
		}
	}
}
