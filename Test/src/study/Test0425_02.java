package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  ��]
 *  ������ 5�� ������ ������ �Է¹޾� ������ �򰡸� ���ϰ� ����� �̿��Ͽ� ������ �����ϴ� ���α׷� ����
 *  switch ~ case ���� BufferedReader�� �̿��Ͽ� ���� �Ͻÿ�.
 * 
 */

public class Test0425_02 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, num3, num4, num5, total, avg = 0;
		char grade;
		
		System.out.print("���� ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.print("��ȸ ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		num4 = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		num5 = Integer.parseInt(br.readLine());
		
		total = num1 + num2 + num3 + num4 + num5;
		avg = total/5;
		
		System.out.println("��� : "+avg);
		
		switch (avg/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("������ "+grade+"�Դϴ�.");
		
	}

}
