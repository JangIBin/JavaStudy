package com.study;

import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("�����⵿��");
		list1.add("���ɰ���");
		
		List<String> list2 = new ArrayList<String>(list1);
		list2.add("��ǻŸ");
		
		List<String> list3 = new ArrayList<String>();
		list3.add("list2");
		
		System.out.println(list3);

	}

}
