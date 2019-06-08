package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo4 {

	public static void main(String[] args) {

		String id = args[0];
		String password = args[1];
		
		if((id.equals("rkfgus90") || id.equals("egoing") || id.equals("sungtaek")) &&  password.equals("sjwkf123")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
		
	}

}
