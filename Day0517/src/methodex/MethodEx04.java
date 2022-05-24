package methodex;

import java.io.*;

public class MethodEx04 {
	public static int sum(int x,int y) {
		return x + y;
	}
	public static int sub(int x,int y) {
		return x - y;
	}
	public static int mul(int x,int y) {
		return x * y;
	}
	public static int div(int x,int y) {
		return x / y;
	}
	public static int per(int x,int y) {
		return x % y;
	}
	
	public static void disp(int a, char b, int c, int result) { // a:ù��° �� b:������ c:�ι�° �� d:�����
		System.out.println("\n"+a+" "+b+" "+c+" = "+result);
	}

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� ����
		int num1 = 0, num2 = 0, tot = 0;
		char op;
		
		System.out.print("ù ��° �� �Է� : ");
		num1 = Integer.parseInt(br.readLine());
		
		do {
			System.out.print("op(+,-,*,/,%) �Է� : ");
			op = (char)System.in.read();
//			System.in.read();
//			System.in.read();
			System.in.skip(2);
			
		} while(op != '+' && op != '-' && op != '*' && op != '/' && op != '%');
		
		System.out.print("�� ��° �� �Է� : ");
		num2 = Integer.parseInt(br.readLine());
		
		// �����ڸ� �������� ó��
		switch (op) {
		case '+':
			tot = sum(num1, num2);
			break;
		case '-':
			tot = sub(num1, num2);
			break;
		case '*':
			tot = mul(num1, num2);
			break;
		case '/':
			tot = div(num1, num2);
			break;
		case '%':
			tot = per(num1, num2);
			break;
		default:
			System.out.println("������ �Է� ����");
			break;
		}
		
		disp(num1, op, num2, tot);
		
	}

}