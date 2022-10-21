package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java174_stream {
	//File class - delete 파일 및 폴더 삭제
	public static void main(String[] args) {
		File file = new File("src/java016_stream/text.txt");
		if(file.exists()) {
				file.delete();
				System.out.println("파일 삭제");
		}else {
			System.out.println("파일 없음");
		}
	}
}


/*
 * java.awt.Frame;
 * java.awt.event.ActionListener;
 * 
 * import java.awt.*
 * import java.awt.event.*
 */
