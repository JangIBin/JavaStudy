package study;

import java.io.IOException;

public class Test04 {

	public static void main(String[] args) throws IOException {

		char ch; //문자를 저장할 변수
		String s = ""; // 결과를 저장할 변수(모음이냐 자음이냐)
		
		System.out.print("알파벳 문자 입력 : ");
		ch = (char)System.in.read();
		
		s= ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z')) ? 
				((ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') || 
						(ch == 'A' || ch == 'I' || ch == 'U' || ch == 'E' || ch == 'O')) ? "모음" : "자음": "알파벳이 아닙니다";
		System.out.println(s);
		
	}

}
