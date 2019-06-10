package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	
	// 고정	    
	public static void numbering(int limit) {
		
		int i = 0;
		
		// int limit = 5;
		
		while(i<limit) {
			System.out.println(i);
			i++;
		}
	}
	
	// 가변
	public static void main(String[] args) {
		numbering(5);
	}
	
	// int limit : 매개 변수, parameter
	// 5 : 인자, argument
	
}
