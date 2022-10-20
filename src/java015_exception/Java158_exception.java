package java015_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java158_exception {
	//File class
	public static void main(String[] args) {
		File file = new File("sample.txt");
		
		//FileNotFoundException은 checked exception이다.
		//반드시 try~catch~finally(예외처리)를 한다.
		FileReader fr = null;
		
		try {
			
		fr = new FileReader(file); //Unhandled exception 이 나올 경우 컴파일 단계에서 예외처리가 되도록 해줘야 한다. -checked exception
		System.out.println(fr.read()); //check된 곳에서 무조건 예외처리를 해야한다.
		}catch(FileNotFoundException ex	 ) {
			System.out.println(ex.toString());
		}catch(IOException ex) {
			System.out.println(ex.toString());
		}
	}
}
