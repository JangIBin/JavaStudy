package com.mapex;

import java.util.*;

public class HashTableEx {
	
	private static final String name[] = {"감자", "고구마", "양파", "당근", "양배추", "호박"};
	private static final String tel[] = {
			"111-1111",
			"222-2222",
			"333-3333",
			"555-5555",
			"666-6666",
			"555-5555"
	};

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<>();
		
		// 해시 테이블에 키, 데이터 입력
		for(int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);
		}
		
//		System.out.println(ht);
		String str = ht.get("감자");
		if(str != null) {
			System.out.println("감자의 전화번호 : " + str);
		}
		
		// 키가 존재하는지 검색
		if(ht.containsKey("나른해")) {
			System.out.println("나른해 자료가 존재합니다.");
		} else {
			System.out.println("자료가 존재하지 않습니다.");
		}
		
		// 값이 존재하는지 검색
		if(ht.containsValue("555-5555")) {
			System.out.println("자료가 존재합니다.");
		} else {
			System.out.println("자료가 존재하지 않습니다.");
		}
		
		ht.remove("호박");
		
		if(ht.contains("호박")) {
			System.out.println("호박 자료가 존재합니다.");
		} else {
			System.out.println("자료가 존재하지 않습니다.");
		}
		
	}

}
