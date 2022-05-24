package study;

import java.util.Scanner;

/*
 *  사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
 *  입력받은 수중에서 가장 큰 수를 출력하는 프로그램 작성
 *  
 *  단, 배열을 이용하여 구현하시오.
 *    
 *    입력할 데이터 개수 : 9
 *    데이터 입력 : 4, 7, 9, 1, 3, 2, 5, 6, 8
 *    가장 큰 수 : 9
 */

public class ArrayEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0, max;
		
		System.out.println("9개의 정수를 입력");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("9개의 정수를 입력");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		max = arr[0];
		
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);

	}

}
