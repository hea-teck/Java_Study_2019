package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	
	// ����	    
	public static void numbering(int limit) {
		
		int i = 0;
		
		// int limit = 5;
		
		while(i<limit) {
			System.out.println(i);
			i++;
		}
	}
	
	// ����
	public static void main(String[] args) {
		numbering(5);
	}
	
	// int limit : �Ű� ����, parameter
	// 5 : ����, argument
	
}
