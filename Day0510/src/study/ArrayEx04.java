package study;

import java.util.Scanner;

/*
 *  ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
 *  �Է¹��� ���߿��� ���� ū ���� ����ϴ� ���α׷� �ۼ�
 *  
 *  ��, �迭�� �̿��Ͽ� �����Ͻÿ�.
 *    
 *    �Է��� ������ ���� : 9
 *    ������ �Է� : 4, 7, 9, 1, 3, 2, 5, 6, 8
 *    ���� ū �� : 9
 */

public class ArrayEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0, max;
		
		System.out.println("9���� ������ �Է�");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("9���� ������ �Է�");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		max = arr[0];
		
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("�ִ밪 : " + max);

	}

}
