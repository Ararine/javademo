package java016_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Java163_stream {
	//입력 스트림 - 바이트 스트림과 문자 스트림 연결, 한글 읽기 가능
	public static void main(String[] args) {
		//바이트 스트림
		InputStream is = System.in;
			
		//바이트 스트림과 문자 스트림 연결
		InputStreamReader ir = new InputStreamReader(is);
		
		//문자 스트림
		BufferedReader br = new BufferedReader(ir);
		System.out.print("데이터 입력: ");
		
		try {
			//한 글자만 읽음
//			int data = br.read();
//			System.out.println(data);
//			System.out.println((char)data);
			
///////////////////////////////////////////////////
			//한 글자씩 순서대로 읽음
			//int data;
//			while((data=br.read())!=13) {
//				System.out.println((char)data);
//			}
			
///////////////////////////////////////////////////
			String line = br.readLine(); //바이트 스트림엔 없고 문자 스트림에만 존재
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close(); //stream 연결 종료(자원 반납)시 연결 순서의 반대의 순서로 종료(반납)한다.
				ir.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
