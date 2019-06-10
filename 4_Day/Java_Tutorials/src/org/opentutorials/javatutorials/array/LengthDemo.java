package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {

		//String[] classGroup = {"최진혁", "최유빈", "김희택"};
		
		// 배열 정의
		
		String[] classGroup = new String[3];
		
		classGroup[0] = "최진혁";
		System.out.println(classGroup.length);
		
		classGroup[1] = "최유빈";
		System.out.println(classGroup.length);

		classGroup[2] = "김희택";
		System.out.println(classGroup.length);

		// length
		// 현재 변수에 담겨있는 값이 몇개 있는지 확인하는 것이 아니고
		// 변수에 담겨있는 배열은 몇개의 값을 수용할 수 있는지 알려줌.
		
	}

}
