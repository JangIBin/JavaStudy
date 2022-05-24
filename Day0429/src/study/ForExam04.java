package study;

import java.util.Scanner;

/*
 *  Scanner를 이용하여 소문자 알파벳을 하나 입력 받고
 *  다음과 같이 출력하는 프로그램을 작성하시오.
 *  
 *  알파벳 입력 : e
 *  abcde
 *  abcd
 *  abc
 *  ab
 *  a
 *  
 */

public class ForExam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		System.out.print("알파벳 입력 : ");
		ch = sc.next().charAt(0);
		
		for (char i = ch; i >= 'a'; i--) {
            for (char j = 'a'; j <= i; j++) {
            	System.out.print(j);
            }
            System.out.println();
		}
		
	}

}
