package com.study;

import java.util.*;
public class LinkedListEx {

	private static final String colors1[] = {
			"검정", "노랑", "녹색", "파랑", "주황", "연두"
	};
	
	private static final String colors2[] = {
			"초록", "빨강", "흰색", "남색", "보라색" 
	};

	public LinkedListEx() {
		
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
		
		for(String color : colors1) {
			list1.add(color);
		}

		for(String color : colors2) {
			list2.add(color);
		}
		
		list1.addAll(list2);
		
		removeItems(list1, 4, 7);
		
		printList(list1);
//		printList(list2);
		printReverseList(list1);
	}
	
	// 자료 제거
	private static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear();
	}
	
	// 역순 출력
	private static void printReverseList(List<String> list) {
		ListIterator<String> it = list.listIterator(list.size());
		
		while(it.hasPrevious()) {
			System.out.printf("%s\t", it.previous());
		}
		System.out.println();
	}
	
	public void printList(List<String> list) {
		
		for(String color : list) {
			System.out.printf("%s\t", color);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedListEx le = new LinkedListEx();
	}
	
}
