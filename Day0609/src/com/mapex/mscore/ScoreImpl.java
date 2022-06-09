package com.mapex.mscore;

import java.io.*;
import java.util.*;

class MyComparator<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		
		ScoreVO s1 = (ScoreVO)o1;
		ScoreVO s2 = (ScoreVO)o2;
		
		int n = s1.getTot() - s2.getTot();
		
		if(n > 1) {
			return 1; // 오름 차순
		} else if(n < 1) {
			return -1; // 내림 차순
		} else {
			return 0; // 같음
		}
		
	}
	
}

public class ScoreImpl implements Score {
	
	private Map<String, ScoreVO> map;
	
	public ScoreImpl() {
		map = new HashMap<String, ScoreVO>();
	}

	@Override
	public int insert() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hak;
		System.out.print("\n학번 입력 : ");
		hak = br.readLine();
		
		if(map.containsKey(hak)) {
			System.out.println("이미 존재하는 학번입니다.");
			return 0;
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		vo.setName(name);
		
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(br.readLine());
		vo.setKor(kor);
		
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(br.readLine());
		vo.setEng(eng);
		
		System.out.print("수학 점수 : ");
		int mat = Integer.parseInt(br.readLine());
		vo.setMat(mat);
		
		map.put(hak, vo);
		
		return 1;
	}

	@Override
	public int update() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hak;
		System.out.print("\n수정할 학번 입력 : ");
		hak = br.readLine();
		
		if(!map.containsKey(hak)) {
			System.out.println("존재하지 않은 학번입니다.");
			return 0;
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setHak(hak);
		
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		vo.setName(name);
		
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(br.readLine());
		vo.setKor(kor);
		
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(br.readLine());
		vo.setEng(eng);
		
		System.out.print("수학 점수 : ");
		int mat = Integer.parseInt(br.readLine());
		vo.setMat(mat);
		
		map.put(hak, vo);
		
		return 1;
	}

	@Override
	public void search() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// search name
		String name;
		System.out.print("\n검색할 이름 입력 : ");
		name = br.readLine();
		
		Set <String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			if(data.getName().equals(name)) {
				System.out.println(data.toString());
			} else {
				System.out.println("검색한 이름이 없습니다.");
			}
		}
		
		System.out.println();
		
		//search hak
//		String hak;
//		System.out.print("\n검색할 학번 입력 : ");
//		hak = br.readLine();
//		
//		if(map.containsKey(hak)) {
//			System.out.println(map.get(hak).toString());
//		}
		
	}

	@Override
	public int delete() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String hak;
		System.out.println("\n삭제할 학번 : ");
		hak = br.readLine();
		if(!map.containsKey(hak)) {
			System.out.println("존재하지 않는 자료 입니다.");
			return 0;
		}
		map.remove(hak);
		System.out.println("삭제가 완료 되었습니다.");
		
		return 1;
	}

	@Override
	public void writeAll() {

		Set <String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			ScoreVO data = map.get(key);
			System.out.println(data.toString());
		}
		
	}

	@Override
	public void writeSort() {

		List<ScoreVO> lists = new ArrayList<>();
		Set<String> set = map.keySet();
		Iterator<String> it1 = set.iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			lists.add(map.get(key));
		}
		
		// 내림차순 정렬
		Collections.sort(lists, Collections.reverseOrder(new MyComparator<ScoreVO>()));
		
		System.out.println("\n[총점 순 정렬]");
		Iterator<ScoreVO> it2 = lists.iterator();
		while (it2.hasNext()) {
			ScoreVO data = it2.next();
			System.out.println(data.toString());
		}
	}

}
