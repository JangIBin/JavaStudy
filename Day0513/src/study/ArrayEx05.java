package study;

import java.io.*;

/*
 *  문]
 *  배열을 이용하여 한명의 학생에 대한 성적처리 프로그램을 작성한다.
 *  
 *  과목 수, 과목 명
 *  이름도 입력
 *  
 *  이름, 과목명, 총점, 평균, 학점
 *  
 */

public class ArrayEx05 {

	public static void main(String[] ar) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 이름 입력 받음
		System.out.print("이름 입력 : ");
		String name = br.readLine();
//		String[] subject = new String[ar.length];
		String[] subject = {"국어", "수학", "영어"};
		
		
		int jumsu[] = new int[subject.length+1];
		
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "점수: ");
			jumsu[i] = Integer.parseInt(br.readLine());
			// 누적함
			jumsu[jumsu.length-1] = jumsu[i];
//			System.out.println("총점 : " + jumsu[jumsu.length-1]);
		}
		
		float avg = jumsu[jumsu.length-1]/(float)(subject.length);
		// 소수점 3자리에서 반올림 반영
		avg = (int)((avg+0.005)*100)/100.f;
		
		char grade = 0;
		switch ((int)(avg/10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("------------   "+name+"님의 성 적 표   ------------");
		System.out.println();
		System.out.println("--------------------------------------------");
		
	}

}
