package study;

/*
 * 1~100 ������ ���� �߿��� 2, 3, 5, 7�� ����� ������ ���� ���࿡
 * 10���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class ForExam01 {
	public static void main(String[] args) {
		
		int i, cnt = 1;
		
		for(i = 0; i <= 100; i++) {
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
				System.out.printf("%3d%s", i, (cnt++ %10 != 0) ? " " : "\n");
			}
		}
	}
}
