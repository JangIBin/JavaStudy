package study;

import java.util.*;

/*
 * 문] 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격
 * 단, 4학년의 경우 70점 이상이어야 합격
 * 
 * 처리조건
 * 학년 4학년, 점수는 65점
 * 
 */



public class Score {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score, grade = 0;
		
		System.out.print("점수를 입력해주세요 : ");
		score = sc.nextInt();
		
		System.out.print("학년을 입력해주세요 : ");
		grade = sc.nextInt();
		
		if(score >= 60) {
			if(grade == 4) {
				if(score >= 70) {
					System.out.println("합격");
				} else {
					System.out.println("불합격");
				}
			} else {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}
		
		sc.close();

		
	}

}
