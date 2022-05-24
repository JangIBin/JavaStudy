package stydy;


/*
 * 숫자 하나 입려
 * - Sysytem.in.read() - 48 or '0'
 * 
 */

import java.io.IOException;

public class InputEx03 {

	public static void main(String[] args) throws IOException{
		
		int num1;
		int num2;
		System.out.print("숫자 1: ");
		num1 = System.in.read() - 48;
		System.in.read(); //\r
		System.in.read(); //\n
		System.out.print("숫자 2: ");
		num2 = System.in.read() - 48;

		System.out.println(num1 + ", " + num2);
		
//		System.out.println(num1);
	}

}
