package study;

/*
 * float, double : �Ǽ��� (�Ǽ����� �⺻���� double)
 */

import java.lang.*;

public class FloatEx {

	public static void main(String[] args) {
		
		double var1, var2;
		long d2 = 3333333333333333333l; // long������ ������� �ڿ�l�� ���δ� �� 19�ڸ� �̻��� ���� �����߻�
		
		var1 = 3.1f; // float�� �����ϰ� ���ڸ� �����Ҷ� �� �Ǽ��ڿ� �ҹ���f�� �ٿ��ش�
		var2 = 5.55;
//		System.out.println(var1);
		
		// 1. �������� �� �ʱ�ȭ
		 int r = 0;
		 double w = 0, h = 0;

		 // 2. ���� �� ó��
		 r = 5;
		 w = r*r*Math.PI;
		 h = 2*r*Math.PI;
		 
		 
		 System.out.println("���� ���� =" + w);
		 System.out.printf("���� ���� = %.3f\n", w);
		 System.out.println("���� �ѷ� =" + h);

	}

}
