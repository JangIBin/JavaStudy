package com.test;

import java.util.*;

public class StackEx {

	public static void main(String[] args) {
		
		// ���� ��ü ����
		 Random r = new Random();
		 // ���� ��ü ����
		 Stack st = new Stack();
		 
		 int nNum, i; // nNum : �������� ������ ������ �����ϴ� ����
		
		 // 10���� ������ ���� ���ÿ� ����
		 System.out.print("���ÿ� ����� �� : ");
		 for(i = 0; i < 10; i++) {
			 r.setSeed(r.nextLong());
			 
			 nNum = (r.nextInt() % 100);// 0 ~ 99 ������ ���ڸ� �����϶�.
			 st.push(nNum);
			 System.out.print(" " + nNum);
		 }
		 
		 // ���ÿ� ����� ���� ���
		 System.out.println();
		 // ���ÿ� ����� �� ���
		 System.out.print("���ÿ� ����� �� ��� : ");
		 for(i = 0; i < 10; i++) {
			 System.out.print(st.pop() + " ");
		 }

	}

}
