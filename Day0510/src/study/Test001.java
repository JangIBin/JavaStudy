package study;

/*
 *  ������ ���ڰ� ����ִ� �迭�� ���� �����͵� ��
 *  ¦���� ��Ҹ� ��� ����ϰ�,
 *  3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� �����Ͻÿ�.
 *  
 *  ������ ���� : 4, 7, 9, 1, 3, 2, 5, 6, 8
 *  
 *  1. �迭�� ��ü ��� ���
 *  2. ¦���� ��� : 
 *  3. 3�� ����� ���
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