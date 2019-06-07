package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {

		String a = "Hello world";
		String b = new String("Hello world");
		
		System.out.println(a == b); //false
		
		//.equals는 문자열을 비교할 때 사용하는 메소드

		System.out.println(a.equals(b)); //true
		
	}

}
