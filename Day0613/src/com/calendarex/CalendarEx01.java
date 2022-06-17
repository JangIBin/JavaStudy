package com.calendarex;

import java.util.*;

public class CalendarEx01 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
//		Calendar now1 = new Calendar();
		/*
			Calendar ��ü�� ������ �� �ִ� ��� 3����
			1. Calendar now = Calendar.getInstance();
			2. Calendar now = new GregorianCalendar();
			3. GregorianCalendar now = new GregorianCalendar();
		 */
		
		String str1 = String.format("%1$tF %1$tA %1$tT", now);
		System.out.println(str1);
		
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH)+1;
		int d = now.get(Calendar.DATE);
		
		int w = now.get(Calendar.DAY_OF_WEEK);
		// 1 ~ 7 : 1 -> �Ͽ��� ~ 7 : �����
		
		String week = "";
		switch (w) {
		case 1:
			week = "�Ͽ���";
			break;
		case 2:
			week = "������";
			break;
		case 3:
			week = "ȭ����";
			break;
		case 4:
			week = "������";
			break;
		case 5:
			week = "�����";
			break;
		case 6:
			week = "�ݿ���";
			break;
		case 7:
			week = "�����";
			break;
		}
		
		System.out.println(y + "-" + m + "-" + d + " " + week);
		
		// ���� ��¥�� 1000�� ���ϸ�?
		now.add(Calendar.DATE, 1000);
		System.out.printf("%tF%n", now);
		
		// 2023.6.15
		now.set(2021, 6-1, 15);
		System.out.printf("%tF%n", now);
		
		now.set(Calendar.DATE, 10);
		System.out.printf("%tF%n", now);
		
		// 2022.6.23
		now.set(2021, 6-1, 32);
		System.out.printf("%tF%n", now);
		
		int dd = now.getActualMaximum(Calendar.DATE);
		System.out.println("�ش� ���� ������ ��¥ : " + dd);
	}
	
}