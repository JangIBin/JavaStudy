package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  ������ ���ĺ��� �Է¹޾� ������ ������ �����ϴ� ���α׷� ����
 *  �����̸� �����̶�� ���, �����̸� �����̶�� ���
 *  ��, ��ҹ��� ��� ������, ���ĺ��̿��� ���ڰ� �ԷµǸ� �Է� ���� ���
 * 
 */

public class Test02 {

	public static void main(String[] args) throws IOException{
		
		char al;

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("���ĺ��� �Է��ϼ��� : ");
		al = (char)System.in.read();
		System.in.read(); //\r
		System.in.read(); //\n
		
		if((al >= 'a' && al <= 'z') || (al >= 'A' && al <= 'Z')) {
			if(al == 'a' || al == 'i' || al == 'u' || al == 'e' || al == 'o' || al == 'A' || al == 'I' || al == 'U' || al == 'E' || al == 'O') {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
		} else {
			System.out.println("�Է� ����!");
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
