package java020_thread.part03;

/*
 * 스레드 생명주기(Thread Life Cycle)
 * start() - 실행준비상태(RUNNABLE) - cpu 할당 받고 run() - TERMINATED
 * 							      sleep(시간 1000 = 1초), wait() - 대기상태(WAITING)
 * 								      notify(), notifyAll()로 깨워줘야한다.
 */
public class LifeCycle extends Thread{

	public LifeCycle() {

	}//end LifeCycle()
	
	@Override
	public void run() {
		System.out.println(getState()); //RUNNABLE
	}
}//end class
