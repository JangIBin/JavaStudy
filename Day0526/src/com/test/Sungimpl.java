package com.test;

import java.util.*;

/*
문제

	인원수 입력 : n
	
	n번째 학생의 학번 이름 입력(공백구분) ex) 1111 김유신
	국어 영어 수학 점수 입력(공백구분)
	
	학번 이름 국어 영어 수학 총점 평균 수우미양가
	
	Record
	이름 name
	String[]scor = new String[3] 과목
	int[] sco = new int[3] 과목점수
	int number, avg, sum
	
	인터페이스 Sung
	set();
	input();
	print();
	
	인터페이스를 구현할 클래스 정의
	Sungimpl

*/

public class Sungimpl extends Record implements Sung {
	
	
	int in;
	Record re[];

	@Override
	public void set() { // 인원수 입력 받는 기능
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("인원수 입력 : ");
			in = sc.nextInt();
		} while (in < 1 || in > 10);
		
		re = new Record[in];
		
	}
	
	// 상세 데이터 입력 및 연산 처리하는 기능
	
	@Override
	public void input() { // 학번, 이름, 과목별, 점수 입력기능, 판정
		Scanner sc = new Scanner(System.in);
		
		sum = 0;
		
		for(int i = 0; i < in; i++) {
			re[i] = new Record();
			System.out.print((i+1) + "번째 학생의 학번 이름 입력 : ");
			re[i].number = sc.nextInt();
			re[i].name = sc.next();
			System.out.println("국어 영어 수학 점수를 입력해주세요.");
			for(int j = 0; j < 3; j++) {
				re[i].sco[j] = sc.nextInt();
				re[i].sum += re[i].sco[j];
			}
			re[i].avg = re[i].sum /3f;
			
			for(int j = 0; j < sco.length; j++) {																																																
				switch (re[i].sco[j] / 10) {
				case 10:
				case 9:
					re[i].scor[j] = "수";
					break;
				case 8:
					re[i].scor[j] = "우";
					break;
				case 7:
					re[i].scor[j] = "미";
					break;
				case 6:
					re[i].scor[j] = "양";
					break;
				default:
					re[i].scor[j] = "가";
					break;
				}
			}
		}
	}

	@Override
	public void print() {
		String[] title = {"국어", "영어", "수학"};
		for(int i = 0; i < in; i++) {
			System.out.println("학번 : " + re[i].number);
			System.out.println("이름 : " + re[i].name);
			for(int j = 0; j < 3; j++) {
				System.out.println(title[j] + " : " +re[i].sco[j]);
			}
			System.out.println("총점 : " + re[i].sum);
			System.out.println("평균 : " + re[i].avg);

			for(int j = 0; j < 3; j++) {
				System.out.println(title[j] + "학점 : " +re[i].scor[j]);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Sungimpl si = new Sungimpl();
		
		si.set();
		si.input();
		si.print();
		
		
	}

}
