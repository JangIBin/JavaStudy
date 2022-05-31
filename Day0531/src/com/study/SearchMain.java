package com.study;

import java.util.*;

public class SearchMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SearchService ssv = new SearchService();
		
		do {
			System.out.print("검색 회원 이름 입력 : ");
			String name = sc.next();

			boolean searchResult = ssv.searchMember(name);
			if(searchResult) break;
			System.out.println("해당 회원이 존재하지 않습니다.");
			
		} while (true);
		
	}

}
