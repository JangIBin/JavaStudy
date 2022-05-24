package study;

import java.io.IOException;

public class Test05 {

	public static void main(String[] args) throws IOException{
		
		char ch, s;
		int n;
		
		System.out.print("알파벳 문자 입력 : ");
		n = (char)System.in.read();

		// 대문자를 입력받았을 경우 소문자로 변환
		// 소문자를 입력 받았을 경우 대문자로 변환
		
		// 1. 입력값이 대문자 라면
		
		if (n >= 65 && n <= 90) {
			n += 32;// n값을 32만큼 증가시킴
			ch = (char)n;
			System.out.println(ch);
		} else if (n >= 97 && n <= 122) {
			n -= 32;// n값을 32만큼 증가시킴
			ch = (char)n;
			System.out.println(ch);
		} else { //입력값이 알파벳이 아니라면 입력오류 출력
			System.out.println("입력 오류");
		}
		
		ch = (n >= 'a' && n <= 'z') ? 
		(char)(n-32) : (n >= 'A' && n <= 'Z') ? (char)(n-32) : 'x';
		System.out.println(ch);
		
		
	}

}
