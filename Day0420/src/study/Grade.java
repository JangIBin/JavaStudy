package study;

import java.util.Scanner;

/*
 * ��] 5���� ������ ������ �Է¹޾� ������ ����� ���ϰ� ����� �̿��Ͽ� ������ �����ϴ� ���α׷��� �����Ͻÿ�.
 * 
 *  A : 90�� �̻�
 *  B : 80�� �̻�
 *  C : 70�� �̻�
 *  D : 60�� �̻�
 *  E : 60�� �̸�
 * 
 */



public class Grade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, his, sci, sum = 0;
		char hak;
		double avg = 0;
		
		System.out.print("�������� : ");
		kor = sc.nextInt();
		
		System.out.print("�������� : ");
		eng = sc.nextInt();
		
		System.out.print("�������� : ");
		mat = sc.nextInt();
		
		System.out.print("�������� : ");
		his = sc.nextInt();
		
		System.out.print("�������� : ");
		sci = sc.nextInt();
		
		sum = kor + eng + mat + his + sci;
		avg = sum / 5.0f;
		
		System.out.printf("���� : %d\n��� : %.2f\n", sum, avg);
		
		if (avg >= 90) {
			hak = 'A';
		} else if(avg >= 80) {
			hak = 'B';
		} else if(avg >= 70) {
			hak = 'C';
		} else if (avg >= 60) {
			hak = 'D';
		} else {
			hak = 'F';
		}
		
		System.out.println("������ " + hak + "�Դϴ�.");
		
		
	}

}
