package stydy;

/*
 * ������ �� ������ �����ڸ� �Է¹޾� ������� ���α׷��� �����Ͻÿ�. 
 * ��, ��������ڴ�(+, -, *, /, %)
 * ��� �Է��� BufferedReader�� ó���Ͻÿ�
 * 
 */

import java.io.*;


public class Calculator {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1, num2, result = 0;
		char op;
		
		System.out.print("ù��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�����ڸ� ����ּ���(+, -, *, /, %) : ");
		op = (char)System.in.read();
		System.in.read(); //\r
		System.in.read(); //\n
		
		System.out.print("�ι�° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		
		if(op == 43) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1+num2));
		} else if(op == 45) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1-num2));
		} else if(op == 42) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1*num2));
		} else if(op == 47) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1/num2));
		} else if(op == 37) {
			System.out.printf("%d %s %d = %d \n", num1,  op,  num2, (num1%num2));
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
		
//		System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1+num2));
		
//		result = num1 + num2;
//		System.out.println(result);
		
	}

}
