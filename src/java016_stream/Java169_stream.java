package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java169_stream {
	//File class - RandomAccessFile class (읽기모드 // 읽기, 쓰기모드 가능)
	public static void main(String[] args) {
		File file = new File("src/java016_stream/score.txt");
		RandomAccessFile raf = null;
		
		try {
			// "r" : 읽기(read)만 가능하다.
			// "rw" : 읽기(read) 쓰기(write)가 가능하다.
			raf = new RandomAccessFile(file, "r");
			
			//현재 위치 리턴
			System.out.println(raf.getFilePointer()); //0
			System.out.println((char)raf.read()); //read() : 유니코드 int 값을 리턴
			System.out.println(raf.getFilePointer()); //1
			System.out.println(raf.readLine()); //im:56/78/12
			System.out.println(raf.getFilePointer()); //14 (enter = carriage retrun : /r line feed : /n) 때문
			System.out.println(raf.readLine()); //hong:46/100/97
			
			System.out.println("====================");
			/*
			kim:56/78/12
			hong:46/100/97
			park:96/56/88
			*/
			
			//포인터의 위치 변경(파일 처음부터 포인터를 찾는다.)
			raf.seek(4);
			System.out.println((char)raf.read()); //5
			System.out.println(raf.readLine()); //6/78/12
			System.out.println(raf.getFilePointer()); //14
			
			//지정된 수 만큼 byte를 건너뛴다. (현재 포인터가 있는 위치를 기준으로 건너뛴다.)
			//앞으로 이동할 수 없다. 즉 raf.skipBytes(-1)은 적용되지 않는다.
			raf.skipBytes(2);
			System.out.println(raf.readLine()); //ng:46/100/97
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}//end main()
}//end class
