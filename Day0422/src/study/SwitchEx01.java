package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// �� ������ �����ڸ� �Է¹޾� ����ϴ� ���α׷��� ����
// switch ~ case

public class SwitchEx01 {

	public static void main(String[] args)  throws IOException{
		
		int num1, num2, total = 0;
		char op;

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("ù��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�����ڸ� ����ּ���(+, -, *, /, %) : ");
		op = (char)System.in.read();
		System.in.read(); //\r
		System.in.read(); //\n
		
		System.out.print("�ι�° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		
		switch (op) {
		// char + - * /
			case '+' :
				total = num1 + num2;	
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;
			case '-' : 
				total = num1 - num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;		
			case '*' : 
				total = num1 * num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;
			case '/' : 
				total = num1 / num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;	
			case '%' : 
				total = num1 % num2;
				System.out.println(num1 + " " + op + " " + num2 + " = " + total);
				break;	
			default:
				System.out.println("�߸��� �����ڸ� �Է��ϼ̽��ϴ�.");
				break;
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + total);
		
		
	}

}
