package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in (사용자가 입력한 값)
		int i = sc.nextInt(); // 커서 깜박일 때, 입력한 값이 i에 담김. Int형 주의할 것.
		System.out.println(i*1000);
		sc.close();
		
	}

}
