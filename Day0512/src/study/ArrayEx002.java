package study;

import java.io.*;

public class ArrayEx002 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor = 0, eng = 0, mat = 0, sum = 0;
		float avg = 0.0f;
		
		do {
			System.out.print("국어 점수 : ");
			kor = Integer.parseInt(br.readLine());
		} while (kor < 0 || kor > 100);
		
		do {
			System.out.print("영어 점수 : ");
			eng = Integer.parseInt(br.readLine());
		} while (eng < 0 || eng > 100);
		
		do {
			System.out.print("수학 점수 : ");
			mat = Integer.parseInt(br.readLine());
		} while (mat < 0 || mat > 100);
		
		sum = kor + eng + mat;
		avg = sum/3.f;
		
		System.out.println();
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
	}

}
