package study;

/*
 *  임의의 숫자가 들어있는 배열의 숫자 데이터들 중
 *  짝수인 요소만 골라서 출력하고,
 *  3의 배수인 요소만 골라서 출력하는 프로그램을 구현하시오.
 *  
 *  임의의 숫자 : 4, 7, 9, 1, 3, 2, 5, 6, 8
 *  
 *  1. 배열의 전체 요소 출력
 *  2. 짝수만 출력 : 
 *  3. 3의 배수만 출력
 */

public class Test001 {

	public static void main(String[] args) {

		int[] arr = new int[] {4, 7, 9, 1, 3, 2, 5, 6, 8};
		int[] even = new int[] {};
		int[] thr = {};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.printf("%2d", arr[i]);
			}
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%3 == 0) {
				System.out.printf("%2d", arr[i]);
			}
		}
		
	}

}
