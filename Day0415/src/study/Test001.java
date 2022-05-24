package study;

import java.util.*;

//문] 위의 세과목의 점수를 입력받아 총점과 평균을 출력해라
//단, 평균은 소수점 2자리까지 출력
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
		
		System.out.print("국어 점수 입력 : ");
		score1 = Integer.parseInt(sc.next());
		System.out.print("수학 점수 입력 : ");
		score2 = Integer.parseInt(sc.next());
		System.out.print("영어 점수 입력 : ");
		score3 = Integer.parseInt(sc.next());
		
		total = score1 + score2 + score3;
		avg = total / 3.0f;
		
		System.out.printf("총합은: " +total+", 평균은 : %.2f", avg);
		
		sc.close();
		
	}

}
