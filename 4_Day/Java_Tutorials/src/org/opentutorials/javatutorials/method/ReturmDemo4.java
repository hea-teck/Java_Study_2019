package org.opentutorials.javatutorials.method;

public class ReturmDemo4 {

	public static String[] getMembers() {
		String[] members = {"ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑÀÌ¶÷"};
		return members;
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();		
		System.out.println(members[0]);
		System.out.println(members[1]);
		System.out.println(members[2]);
	}

}
