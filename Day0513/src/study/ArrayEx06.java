package study;

import java.io.*;

public class ArrayEx06 {

	public static void main(String[] ar) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수 입력 : ");
		int human = Integer.parseInt(br.readLine()); // 사람 수 구하기
		
		String[] name = new String[human];
		String[] subject = {"국어", "수학", "영어"}; // 과목명 초기화
		// 점수와 총점 처리 배열선언
		int[][] jumsu = new int[human][subject.length-1];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
//		for(int i = 0; i < subject.length; i++) {
//			System.out.println(subject[i]);
//		}
		
		for(int i = 0; i < human; i++) {
			System.out.println((i+1)+"번째 학생 이름: ");
			name[i] = br.readLine();
			
			System.out.println(name[i]+"학생 점수 입력: ");
			for(int j = 0; j < subject.length; j++) {
				System.out.println(subject[j]="점수 : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
			}
			
		}
		
	}

}
