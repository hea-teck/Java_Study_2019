package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	      
	// String : numbering() 메소드가 return할 값이 반드시 문자열 이라는 의미
	public static String numbering(int init, int limit) {
		
		int i = init;		
		String output = "";
		
		while (i<limit) {
			output += i;
			i++;
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {
		
		// numbering() 메소드 정의가 String값을 return하므로 반드시 result변수 타입도 String 이어야 함.
		String result = numbering(1, 5);
		System.out.println(result);
	}

}
