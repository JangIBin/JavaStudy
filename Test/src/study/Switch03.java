package study;

import java.util.Scanner;

/*
 * 	��Ģ ������ �Է¹޾� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 	�����ڴ� +, -, *, / �װ����� ��� �Ǽ��� ó����
 * 
 * 	�ǿ����ڿ� �����ڴ� ��ĭ���� �и��Ͽ� �Է�
 * 	0���� ������ �� "0���� ������ �����ϴ�"�� ����ϰ� ������
 * 
 * 	switch ~ case ���� �̿��Ͽ� �ۼ�
 * 	�����ڴ� Scanner�� ����Ͽ� ���ڿ��� �Է¹����ÿ�.
 */

public class Switch03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, result = 0;
		String op;
		
		System.out.print("���� �Է� : ");
		num1 = sc.nextInt();
		op = sc.next();
		num2 = sc.nextInt();

//		System.out.print("���� �Է� : ");
//		num1 = sc.nextInt();
//		
//		System.out.print("������ �Է� : ");
//		op = sc.next();
//		
//		System.out.print("���� �Է� : ");
//		num2 = sc.nextInt();
		
		switch (op) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("0���� ������ �����ϴ�.");
				return;
			}
			result = num1/num2;
			break;
		default:
			System.out.println("������ �Է� ����!");
			break;
		}
		
		System.out.println(num1+" "+op+" "+ num2 +" = "+ result);
		
		
	}

}
