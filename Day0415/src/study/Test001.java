package study;

import java.util.*;

//��] ���� �������� ������ �Է¹޾� ������ ����� ����ض�
//��, ����� �Ҽ��� 2�ڸ����� ���
public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score1, score2, score3, total = 0;
		double avg;
		
		score1 = 0;
		score2 = 0;
		score3 = 0;
		total = 0;
		avg = 0;
		
		System.out.print("���� ���� �Է� : ");
		score1 = Integer.parseInt(sc.next());
		System.out.print("���� ���� �Է� : ");
		score2 = Integer.parseInt(sc.next());
		System.out.print("���� ���� �Է� : ");
		score3 = Integer.parseInt(sc.next());
		
		total = score1 + score2 + score3;
		avg = total / 3.0f;
		
		System.out.printf("������: " +total+", ����� : %.2f", avg);
		
		sc.close();
		
	}

}
