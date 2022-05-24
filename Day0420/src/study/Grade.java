package study;

import java.util.Scanner;

/*
 * 문] 5개의 과목의 점수를 입력받아 총점과 평균을 구하고 평균을 이용하여 학점을 판정하는 프로그램을 구현하시오.
 * 
 *  A : 90점 이상
 *  B : 80점 이상
 *  C : 70점 이상
 *  D : 60점 이상
 *  E : 60점 미만
 * 
 */



public class Grade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, his, sci, sum = 0;
		char hak;
		double avg = 0;
		
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		mat = sc.nextInt();
		
		System.out.print("역사점수 : ");
		his = sc.nextInt();
		
		System.out.print("과학점수 : ");
		sci = sc.nextInt();
		
		sum = kor + eng + mat + his + sci;
		avg = sum / 5.0f;
		
		System.out.printf("총점 : %d\n평균 : %.2f\n", sum, avg);
		
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
		
		System.out.println("학점은 " + hak + "입니다.");
		
		
	}

}
