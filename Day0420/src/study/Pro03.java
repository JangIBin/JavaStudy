package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ������ �⵵�� �Է¹޾� �Է¹��� �⵵�� �������� ������� �����ϴ� ���α׷� ����
 * 
 * �������� ����
 * - �⵵�� 4�� ����̸鼭 100�� ����� �ƴϰų� 400�� ����̸� ���� �׷�ġ ������ ���
 * 
 */

public class Pro03 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year = 0;
		String exm;
		
		
		System.out.print("������ �⵵ �Է� : ");
		year = Integer.parseInt(br.readLine());
		
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println(year + "���� �����̴�");
//		} else {
//			System.out.println(year + "���� ����̴�.");
//		}
		
		exm = (year%4==0 && year%100!=0 || year%400==0) ? "����" : "���"; 
		System.out.println(year + "���� "+exm + "�̴�.");
		
		
	}

}
