package methodex;

import java.io.*;

public class MethodEx06 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// 클래스 메소드
	public static int getInt(String str) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//인스턴스 메소드
		System.out.print(str+" : ");
		int imsi = Integer.parseInt(br.readLine());
		
		return imsi;
	}

	public static void main(String[] args) throws IOException {
		
//		int kor = 30;
		int kor = getInt("국어");
		System.out.println("당신의 국어점수는 "+kor+"입니다.");

	}

}
