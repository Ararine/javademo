package java009_inheritance.part05;
//import java.lang.Override; - java.leng package에 있는 요소들은 이미 탑재가 되어 있어 추가적으로 import 할 필요는 없다.
//import java.lang.System;
//import java.lang.String;

public class Second extends First{
	int b = 20;
	
	@Override
	void display() {
		System.out.println("b=" + b);
	}
	
	void superThisMethod() {
		super.display();
		this.display();
	}
}
