package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			if(i == 5) {
				continue; // 멈추고 위 for문으로 다시 돌아갈 것.
			}
			System.out.println("hahaha" + i);
		}
		
	}

}
