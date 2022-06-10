package com.boardex;

import java.util.*;

public class BoardSVC {

	ArrayList<BoardVO> boardList;
	// HashMap 사용
//	ArrayList<HashMap<String, String>> boardList;
	
	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
		// HashMap 사용
//		boardList = new ArrayList<HashMap<String, String>>();
	}
	
	// 글쓰기
	public void wirteArticle(Scanner sc) {
		System.out.println("게시판 글을 작성 하세요.");
		System.out.print("작성자 : ");
		String register = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("비밀번호 : ");
		String passwd = sc.next();
		System.out.print("제목 : ");
		String subject = sc.next();
		System.out.print("글내용 : ");
		String content = sc.next();
		
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		// ArrayList에 추가
		addArticle(boardVO);
		
		// HashMap 사용
//		HashMap<String, String> boardMap = new HashMap<String, String>();
//		boardMap.put("register", register);
//		boardMap.put("subject", subject);
//		boardMap.put("email", email);
//		boardMap.put("content", content);
//		boardMap.put("passwd", passwd);
//		
//		addArticle(boardMap);
	}
	
	// 글을 리스트에 추가
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// HashMap 사용
//	private void addArticle(HashMap<String, String> boardMap) {
//		boardList.add(boardMap);
//	}
	
	// 목록 보기
	public void listArticle(Scanner sc) {
		
		if(boardList.size() > 0) {
			
			for(int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i));
			}
			
			
			// HashMap 사용
//			for(int i = 0; i < boardList.size(); i++) {
//				System.out.println(
//						"register : " + boardList.get(i).get("register") + 
//						"subject : " + boardList.get(i).get("subject") + 
//						"email : " + boardList.get(i).get("email") + 
//						"content : " + boardList.get(i).get("content") 
//				);
//			}
		} else {
			System.out.println("둥록된 게시글이 없습니다.");
		}
		
	}
	
	// 글삭제
	
	public void removeArticle(Scanner sc) {
		
		System.out.println("게시글을 제거할때는 글의 작성자와 비밀번호를 입력하세요.");
		System.out.print("작성자 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String passwd = sc.next();
		
		removeArticle(name, passwd);
		
	}
	
	public void removeArticle(String register, String passwd) {
		// 삭제 기능
		if(boardList.size() > 0) {
			int index =- 1;
			
			for(int i = 0; i < boardList.size(); i++) {
				if(boardList.get(i).getRegister().equals(register)) { // 작성자가 맞는 경우
					if(boardList.get(i).getPasswd().equals(passwd)) { // 비밀번호가 맞는 경우
						boardList.remove(boardList.get(i));
						index = i;
					}
				}
			}
			
			// HashMap 사용
//			for(int i = 0; i < boardList.size(); i++) {
//				if(boardList.get(i).get("register").equals(register)) { // 작성자가 맞는 경우
//					if(boardList.get(i).get("passwd").equals(passwd)) { // 비밀번호가 맞는 경우
//						boardList.remove(boardList.get(i));
//						index = i;
//					}
//				}
//			}
			if(index == -1) { // 인덱스가 없는 경우
				System.out.println("해당 글에 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}
			
		} else {
			System.out.println("둥록된 게시글이 없습니다.");
		}
		
		
	}
	
}

