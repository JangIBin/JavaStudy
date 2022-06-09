package com.mapex;

import java.util.*;

public class HashMapEx02 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("ȫ�浿", 90);
		map.put("�̼���", 100);
		map.put("���̺�", 150);
		map.put("���ڹ�", 50);
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		/*
			Ű�� ���� set���·� ����(HashMap�� �̿��� key�� value�� �����ֱ� ���ؼ� entry�� �̿���)
			
			���� ��Ʈ��*Ű�� ���� �ѽ�(���)�̴�.)
			Map.Entry���� entrySet() �޼ҵ尡 ����
			entrySet()�޼ҵ�� ����(��Ŭ����)Ŭ������ ���ϴ� ��Ҹ� ������ ���� �÷��Ǻ並 ������
			���� ��Ʈ���� ������ ����ϴ� ������ ����� �ݺ���()�� �̿��ؼ� �����
		 */
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("name : " + e.getKey() + ", score : " +e.getValue());
		}
		
		Set set2 = map.keySet();
		System.out.println("�̸� : " + set2);
		
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		while(it2.hasNext()) {
			int i = it2.next();
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum/set2.size());
		System.out.println("�ִ밪 : " + Collections.max(v));
		System.out.println("�ּҰ� : " + Collections.min(v));
	}

}