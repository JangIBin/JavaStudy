package study;

/*
 * return �ڿ� �ƹ��͵� ������ �ʴ� ���� ���� �޼ҵ��� main()�� ������ void�� �����Ǿ��� �����̴�.
 * void�� �ƹ��͵� ���ٴ� �ǹ��̴�. �� return �ڿ� ���̴� ���� ���� �޼ҵ��� ��������(�� ��쿡�� void��)�� ��ġ�ؾ� �Ѵ�.
 * ���� main�޼ҵ尡 int main()�� ���� �Ǿ� �ִٸ� return 0;�� ���� ������ ���� ����Ѵ�.
 */

public class ForExam01 {

	public static void main(String[] args) {
		// 1���� 10������ �հ� : 55
		// ���� ����
		int i, sum = 0;
		
		for(i = 1; i <= 10; i ++) {
			sum = sum + i;
			System.out.println(i+"�̸� "+sum+"�Դϴ�.");
		}
		
		
	}

}
