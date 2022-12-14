package java018_collection;

import java.util.LinkedList;

/*
 * Queue(큐)
 * 1. FIFO(First In First Out) : 제일 먼저 저장한 요소를
 * 							제일 먼저 꺼내온다.
 * 2. 최근사용문서, 인쇄작업대기목록, 버퍼
 */
public class Java191_LinkedList {
	//LinkedList - Queue (offer, poll)
	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		
		//append
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("String"));
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll()); //포인터를 이동하면서 꺼내오기 때문에 pop() 을 사용해도 같은 결과가 도출된다.
	}
}
