package java017_collection;

import java.util.LinkedList;

/*
 * stack(스택)
 * 1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 */
public class Java190_LinkedList {
	//LinkedList - stack 에서의 메소드 (push, pop)
	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		
		//append
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("string"));
		
//		System.out.println(nStack.pop()); //데이터 자체를 꺼내온다.
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop()); //java.util.NoSuchElementException 
		
		while(!nStack.isEmpty()) //isEmpty() : 요소가 없으면 true 없으면 false
			System.out.println(nStack.pop());
		}
}
