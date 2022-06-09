package com.mapex;

import java.util.*;

public class HashMapEx02 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 90);
		map.put("이순신", 100);
		map.put("장이빈", 150);
		map.put("굿자바", 50);
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		/*
			키와 값을 set형태로 저장(HashMap을 이용해 key와 value을 묶어주기 위해서 entry를 이용함)
			
			맵의 엔트리*키와 값의 한쌍(페어)이다.)
			Map.Entry에는 entrySet() 메소드가 있음
			entrySet()메소드느 현재(이클립스)클래스에 속하는 요소를 가지는 맵의 컬렉션뷰를 돌려줌
			맵의 엔트라이 참조를 취득하는 유일한 방법은 반복자()를 이용해서 취득함
		 */
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("name : " + e.getKey() + ", score : " +e.getValue());
		}
		
		Set set2 = map.keySet();
		System.out.println("이름 : " + set2);
		
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		while(it2.hasNext()) {
			int i = it2.next();
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/set2.size());
		System.out.println("최대값 : " + Collections.max(v));
		System.out.println("최소값 : " + Collections.min(v));
	}

}
