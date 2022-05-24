package com.ex02;

/*
 *  Sung 클래스
 *  	- 인원수를 입력받아, 입력받은 인수 만큼 이름, 국어, 영어, 수학점수를 입력받고
 *  	  총점과 평균, 석차를 구하는 프로그램을 작성하시오(클래스 설계)
 *  
 *  	속성 : 인원수, Record 배열
 *  	기능 : 1. 인원수 입력하는 기능
 *            2. 데이터 입력하는 기능
 *            3. 연산 처리하는 기능
 *            4. 결과를 출력하는 기능
 */

import java.util.*;

public class Sung {

	// 주요변수 선언(속성)
	int inwon; // 인원 수
	Record[] rec; // Record[] 배열
	
	// 기능 (메소드)
	// 1. 인원수 입력
	public void set() {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("인원 수 입력(1~100): ");
			inwon = sc.nextInt();
		} while(inwon < 1 || inwon > 100);
		
		// Record 클래스의 배열 변수를 inwon만큼 생성한 것임
		// Record 클래스의 인스턴스를 생성한 것은 아니다.
		rec = new Record[inwon];
	}
	
	// 2. 상세 데이터 입력 및 연산 처리 기능
	
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		String[] title = {"국어 점수 : ", "수학 점수 : ", "영어 점수 : "};
		
		for(int i = 0; i < inwon; i++) {
			//인스턴스 생성(중요)
			rec[i] = new Record();
			
			System.out.print((i+1)+"번째 이름 입력 : ");
			rec[i].name = sc.next();
			
			for(int j = 0; j < title.length; j++) {
				// 안내 메세지 출력
				System.out.print(title[j]);
				
				// 입력 받은 score 배열에 저장한다.
				rec[i].score[j] = sc.nextInt();
				
				// 점수를 반복적으로 입력받아 누적시켜 총점을 구한다.
				rec[i].tot += rec[i].score[j];
			}
			
			//평균계산
			rec[i].avg = rec[i].tot/ 3.0;
		}
		
	}
	
	public void display() {
		ranking();
		System.out.println("============= 학생 성적표 =============");
		for(int i = 0; i < inwon; i++) {
			// 이름 출력
			System.out.printf("%3s", rec[i].name);
			// 국어, 영어, 수학 점수를 반복 출력
			for(int j = 0; j < 3; j++) {
				System.out.printf("%5d", rec[i].score[j]);
				// 총점, 평균 출력
			}
			
			System.out.printf("%7d %7.2f %5d", rec[i].tot, rec[i].avg, rec[i].rank);
			System.out.println();
		}
		System.out.println("====================================");
	}
	
	public void ranking() {

		int i, j;
		
		// 모든 학생의 등수를 1로 초기화
		for(i = 0; i < inwon; i++) {
			rec[i].rank = 1;
		}
			// 등수 계산
			
		for(i = 0; i < inwon-1; i++) {
			for(j = i+1; j < inwon; j++) { // 1 2
				if(rec[i].avg > rec[j].avg) 
					rec[j].rank++;
				else if (rec[i].avg > rec[j].avg) 
					rec[i].rank++;
				
			}
		}
		
	
	}
	
	
}
