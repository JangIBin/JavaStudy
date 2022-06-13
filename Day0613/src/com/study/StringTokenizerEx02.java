package com.study;

import java.util.*;
public class StringTokenizerEx02 {
	
	public static void main(String[] args) {

		String str = "학교, 집,, 게임방";
		
		StringTokenizer tokens = new StringTokenizer(str, ",");
//		String str = "삶이 그대를 속일지라도 슬퍼하거나 노여워말라.";
		for(int x = 1; tokens.hasMoreTokens(); x++) {
			System.out.println("문자 : " + x + " : " + tokens.nextToken() + '\t');
		}
		System.out.println();
		System.out.println("=========================");
		String[] values = str.split(",");
		for(int x = 0; x < values.length; x++) {
			System.out.println("문자 " + (x + 1) + " : " + values[x] + "\t");
		}
		// String 클래스의 메소드는 무의미한 공백도 하나의 자리로 인정함
		
		
	}

}
