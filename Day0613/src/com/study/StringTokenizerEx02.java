package com.study;

import java.util.*;
public class StringTokenizerEx02 {
	
	public static void main(String[] args) {

		String str = "�б�, ��,, ���ӹ�";
		
		StringTokenizer tokens = new StringTokenizer(str, ",");
//		String str = "���� �״븦 �������� �����ϰų� �뿩������.";
		for(int x = 1; tokens.hasMoreTokens(); x++) {
			System.out.println("���� : " + x + " : " + tokens.nextToken() + '\t');
		}
		System.out.println();
		System.out.println("=========================");
		String[] values = str.split(",");
		for(int x = 0; x < values.length; x++) {
			System.out.println("���� " + (x + 1) + " : " + values[x] + "\t");
		}
		// String Ŭ������ �޼ҵ�� ���ǹ��� ���鵵 �ϳ��� �ڸ��� ������
		
		
	}

}
