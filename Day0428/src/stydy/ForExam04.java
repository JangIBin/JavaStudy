package stydy;

import java.util.Scanner;

public class ForExam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float total, input;
		
		total = input = 0.0f;

		int count = 0;;
		
		for(;input >= 0.0;) {
			total = total + input;
			System.out.println("���� �Ǽ� �Է�: ");
			input = sc.nextFloat();
			count++;
		}
		System.out.println("���ݱ����� ���: "+total/count);
	}

}
