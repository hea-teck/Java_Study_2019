package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	      
	// String : numbering() �޼ҵ尡 return�� ���� �ݵ�� ���ڿ� �̶�� �ǹ�
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
		
		// numbering() �޼ҵ� ���ǰ� String���� return�ϹǷ� �ݵ�� result���� Ÿ�Ե� String �̾�� ��.
		String result = numbering(1, 5);
		System.out.println(result);
	}

}
