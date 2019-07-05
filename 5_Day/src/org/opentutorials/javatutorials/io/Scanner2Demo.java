package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) { // 사용자가 입력한 값이 숫자가 아니라 문자라면 false 반환
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();

	}

}
