package com.sortex;

import java.util.*;

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			
			return c1.compareTo(c2) * -1;
			// return c2.compareTo(c1) * -1;
		}
		
		return -1;
	}
	
}

public class ComparatorEx {

	public static void main(String[] args) {
		Descending d = new Descending();
		
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		// 오름차순
		Arrays.sort(strArr);
		System.out.println("strArr : " + Arrays.toString(strArr));
		// 대소문자 구분없이
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr : " + Arrays.toString(strArr));
		// 내림차순 정렬
		Arrays.sort(strArr, d);
		System.out.println("strArr : " + Arrays.toString(strArr));
		
	}

}
