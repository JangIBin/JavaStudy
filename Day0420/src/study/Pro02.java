package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * ��] ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ �������, ��������, 0������ �����ϴ� ���α׷� ����
 * 
 * if or ���׿����� Ȱ��
 * 
 */


public class Pro02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num = 0;
		String exm;
		
		System.out.print("���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		exm = (num >= 0) ? ((num == 0) ? "0�Դϴ�" : "����Դϴ�") : "�����Դϴ�.";
		
		System.out.println(exm);
		
		
	}

}
