package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  임의의 알파벳을 입력받아 자음과 모음을 판정하는 프로그램 구현
 *  자음이면 자음이라고 출력, 모음이면 모음이라고 출력
 *  단, 대소문자 모두 적용함, 알파벳이외의 문자가 입력되면 입력 오류 출력
 * 
 */

public class Test02 {

	public static void main(String[] args) throws IOException{
		
		char al;

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("알파벳을 입력하세요 : ");
		al = (char)System.in.read();
		System.in.read(); //\r
		System.in.read(); //\n
		
		if((al >= 'a' && al <= 'z') || (al >= 'A' && al <= 'Z')) {
			if(al == 'a' || al == 'i' || al == 'u' || al == 'e' || al == 'o' || al == 'A' || al == 'I' || al == 'U' || al == 'E' || al == 'O') {
				System.out.println("모음");
			} else {
				System.out.println("자음");
			}
		} else {
			System.out.println("입력 오류!");
		}

//		switch (al) {
//		case 'a':
//		case 'i':
//		case 'u':
//		case 'e':
//		case 'o':
//		case 'A':
//		case 'I':
//		case 'U':
//		case 'E':
//		case 'O':
//			System.out.println();
//			
//
//		default:
//			break;
//		}
		
	}

}
