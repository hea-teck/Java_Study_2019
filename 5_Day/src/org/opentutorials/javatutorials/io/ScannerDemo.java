package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // System.in (����ڰ� �Է��� ��)
		int i = sc.nextInt(); // Ŀ�� ������ ��, �Է��� ���� i�� ���. Int�� ������ ��.
		System.out.println(i*1000);
		sc.close();
		
	}

}
