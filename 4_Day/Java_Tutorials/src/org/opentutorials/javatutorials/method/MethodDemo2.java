package org.opentutorials.javatutorials.method;

public class MethodDemo2 {

		// numbering() 메소드 정의	
		public static void numbering() {
			int i = 0;
			while (i < 10) {
				System.out.println(i);
				i++;
			}
		}
	    
		// main 메소드
		public static void main(String[] args) {
			numbering();
			numbering();
			numbering();
			numbering();
			numbering();
		}
		
		// 메소드를 사용하는 이유.
		// = 재활용, 코드량 감소, 유지보수 편리

}
