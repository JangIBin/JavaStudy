package study;

import java.util.Scanner;

/*
 * switch ~ case ���� �̿��Ͽ� Ŀ�� �޴��� ������ �˷��ִ� ���α׷� ����
 * Ŀ�Ǹ޴� : ���������� , īǪġ��, ī��󶼴� 3,500�̰�
 * �Ƹ޸�ī��� 2,000���Դϴ�. 
 */

public class CoffeePrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� Ŀ�Ǹ� �帱���? : ");
		String order = sc.next();
		int price = 0;
		
		switch (order) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "�Ƹ޸�ī��":
			price = 2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�. �ٽ� �ֹ����ּ���");
		}
		System.out.println(order+"�� "+price+"�� �Դϴ�.");
	}

}
