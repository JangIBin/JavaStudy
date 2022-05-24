package study;

import java.util.Scanner;

public class Gugudan01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		
		for (int i = 2; i < 9; i += 3) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + a; k++)
					System.out.printf(k + "*" + j + "=" + k * j + "\t");
					System.out.println();
			}
			System.out.println();
		}

	}

}
