package study;

import java.util.Scanner;

/*
 * ����, ����, ���� ������ �Է¹޾� ������ ��� �׸��� ������ ���ϴ� ���α׷��� �ۼ�
 * ����: 100~90:A, ~ 60�� ���ϴ� F�� ó��
 * ����� �Ҽ������� ���ڸ� ���� ǥ��
 * ��, �� ������ ������ 0~100�� ����� ����
 */

public class DoWhileExam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum = 0;
		double avg = 0.00f;
		String grd;
		
//		do {
//		
//			System.out.print("���� ���� : ");
//			kor = sc.nextInt();
//			
//			System.out.print("���� ���� : ");
//			eng = sc.nextInt();
//			
//			System.out.print("���� ���� : ");
//			mat = sc.nextInt();
//			
//			if((kor <= 0 || kor >= 100) || (eng <= 0 || eng >= 100) || (mat <= 0 || mat >= 100)) {
//				System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���(0~100)");
//			}
//			
//		} while ((kor <= 0 || kor >= 100) || (eng <= 0 || eng >= 100) || (mat <= 0 || mat >= 100));
		
		do {
			System.out.print("���� ���� : ");
			kor = sc.nextInt();
		} while (kor <= 0 || kor >= 100);
		
		do {
			System.out.print("���� ���� : ");
			eng = sc.nextInt();
		} while (eng <= 0 || eng >= 100);
		
		do {
			System.out.print("���� ���� : ");
			mat = sc.nextInt();
		} while (mat <= 0 || mat >= 100);
		
		
		sum = kor+eng+mat;
		
		avg = sum/3.00f;
		
		switch((sum/3)/10) {
			case 10:
			case 9:
				grd = "A";
				break;
			case 8:
				grd = "B";
				break;
			case 7:
				grd = "C";
				break;
			case 6:
				grd = "D";
				break;
			default :
				grd = "F";
				break;
		}
		
		System.out.printf("���� : %d\n��� : %.2f\n���� : %s", sum, avg, grd);
		
	}

}
