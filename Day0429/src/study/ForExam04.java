package study;

import java.util.Scanner;

/*
 *  Scanner�� �̿��Ͽ� �ҹ��� ���ĺ��� �ϳ� �Է� �ް�
 *  ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  
 *  ���ĺ� �Է� : e
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
		
		System.out.print("���ĺ� �Է� : ");
		ch = sc.next().charAt(0);
		
		for (char i = ch; i >= 'a'; i--) {
            for (char j = 'a'; j <= i; j++) {
            	System.out.print(j);
            }
            System.out.println();
		}
		
	}

}
