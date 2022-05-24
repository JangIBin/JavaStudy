package study;

/*
 *  1. �⵵�� 4�� ������ �������� �ش� �������� �Ѵ�.
 *  2. �� �߿��� 100���� ������ �������� �ش� ������� �Ѵ�.
 *  3. �ٸ� 400���� ������ �������� �ش� �ٽ� �������� ����.
 *  
 *  1���� ��ճ�¥�� 365.2425�Ϸ� ���Ͽ� ��
 *  ���� 1�⺸�� 0.0003�� �� ���
 *  
 *  ������ ��¥�� 30, 31��
 *  
 *  29���̸� ����, 28���̸� ���
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year, month, day = 0;
		String exm,ex;
		
		
		System.out.print("������ �⵵ �Է� : ");
		year = Integer.parseInt(br.readLine());
		
		System.out.print("�� �Է� : ");
		month = Integer.parseInt(br.readLine());
		
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println(year + "���� �����̴�");
//		} else {
//			System.out.println(year + "���� ����̴�.");
//		}
		
//		exm = (year%4==0 && year%100!=0 || year%400==0) ? "����" : "���"; 
//		System.out.println(year + "���� "+exm + "�̴�.");
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		default:
			day = 0;
			break;
		}
		
		if(day != 0) {
			if(month != 2) {
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					System.out.println(year+"�� "+month+"���� "+day+" �����Դϴ�.");
				} else {
					System.out.println(year+"�� "+month+"���� "+day+" ����Դϴ�.");
				}
			} else {
				if(day == 29) {
					System.out.println(year+"�� "+month+"���� "+day+" �����Դϴ�.");
				} else {
					System.out.println(year+"�� "+month+"���� "+day+" ����Դϴ�.");
				}
			}
		} else {
			System.out.println("�Է� ����!!!");
		}
	}
}
