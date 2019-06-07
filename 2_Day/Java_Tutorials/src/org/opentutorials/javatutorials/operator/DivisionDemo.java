package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {

		//기본적인 정수형 상수는 int형 데이터 타입이고 실수형 상수는 double형 데이터 타입이다.
		//즉, 아래 F를 붙인 이유이다.
		
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); // 정수/정수 = 정수 (데이터 손실 발생)
		System.out.println(c/d); // 실수/실수 = 실수
		
		System.out.println(a/d); // 정수/실수 = (정수 -> 실수) / 실수 = 실수 
                                     // 데이터 타입 형 변환 발생으로 인해		
	}

}
