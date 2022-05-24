package study;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int max, min;
		
		System.out.println("5개의 정수를 입력");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		max = num[0];
		min = num[0];
		
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
