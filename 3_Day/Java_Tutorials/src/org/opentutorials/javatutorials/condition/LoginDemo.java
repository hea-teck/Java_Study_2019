package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {

		String id = args[0]; //입력값이 들어온다.
		if(id.equals("huitaek")) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
		
	}

}
