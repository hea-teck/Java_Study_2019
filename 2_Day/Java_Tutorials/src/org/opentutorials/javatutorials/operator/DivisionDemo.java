package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {

		//�⺻���� ������ ����� int�� ������ Ÿ���̰� �Ǽ��� ����� double�� ������ Ÿ���̴�.
		//��, �Ʒ� F�� ���� �����̴�.
		
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); // ����/���� = ���� (������ �ս� �߻�)
		System.out.println(c/d); // �Ǽ�/�Ǽ� = �Ǽ�
		
		System.out.println(a/d); // ����/�Ǽ� = (���� -> �Ǽ�) / �Ǽ� = �Ǽ� 
                                     // ������ Ÿ�� �� ��ȯ �߻����� ����		
	}

}
