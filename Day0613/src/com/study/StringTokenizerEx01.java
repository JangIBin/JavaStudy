package com.study;

/*
	java.util ��Ű���� ����
	"2022/06/13" �̶�� ���ڿ��� ���� 2022, 06, 13���� �и��Ҷ� �����
	������ ���ڿ��� ��ū�̶�� ��
 */

import java.util.*;
public class StringTokenizerEx01 {
	
	StringTokenizer st;
	
	public StringTokenizerEx01(String str) {

		st = new StringTokenizer(str);
	}
	
	public StringTokenizerEx01(String str, String delim) {

		System.out.println("str : " + str);
		st = new StringTokenizer(str, delim);
	}
	
	public void print() {
		System.out.println("Token count : " + st.countTokens());
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

	public static void main(String[] args) {

		StringTokenizerEx01 st1 = new StringTokenizerEx01("Happy Day");
		st1.print();
		StringTokenizerEx01 st2 = new StringTokenizerEx01("2022/06/13", "/");
		st2.print();
		
	}

}
