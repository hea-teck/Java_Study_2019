package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {

		int i = 3;
		i++;
		System.out.println(i); // 4 출력
		++i;
		System.out.println(i); // 5 출력
		
		System.out.println(++i); // 6출력
		System.out.println(i++); //6 출력 후 1 증가!!
		
		System.out.println(i); // 7 출력

	}

}
