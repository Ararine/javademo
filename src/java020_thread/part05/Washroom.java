package java020_thread.part05;

//공유자원
public class Washroom {
	
	synchronized void openDoor(String name) { //synchronized를 공유 자원 앞에 붙여주면 동기화된다.
		System.out.println(name + "님이 입장");
		for(int i=0; i<50000; i++) {
			if(i%10000 ==0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name + "님이 업무 보는 중");
			}//end if
		}//end for
		System.out.println(name + "님이 퇴장");
	}//end openDoor()
}//end class

