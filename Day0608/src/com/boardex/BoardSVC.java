package com.boardex;

import java.util.*;

public class BoardSVC {

	ArrayList<BoardVO> boardList;
	// HashMap ���
//	ArrayList<HashMap<String, String>> boardList;
	
	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
		// HashMap ���
//		boardList = new ArrayList<HashMap<String, String>>();
	}
	
	// �۾���
	public void wirteArticle(Scanner sc) {
		System.out.println("�Խ��� ���� �ۼ� �ϼ���.");
		System.out.print("�ۼ��� : ");
		String register = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		System.out.print("��й�ȣ : ");
		String passwd = sc.next();
		System.out.print("���� : ");
		String subject = sc.next();
		System.out.print("�۳��� : ");
		String content = sc.next();
		
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		// ArrayList�� �߰�
		addArticle(boardVO);
		
		// HashMap ���
//		HashMap<String, String> boardMap = new HashMap<String, String>();
//		boardMap.put("register", register);
//		boardMap.put("subject", subject);
//		boardMap.put("email", email);
//		boardMap.put("content", content);
//		boardMap.put("passwd", passwd);
//		
//		addArticle(boardMap);
	}
	
	// ���� ����Ʈ�� �߰�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}

	// HashMap ���
//	private void addArticle(HashMap<String, String> boardMap) {
//		boardList.add(boardMap);
//	}
	
	// ��� ����
	public void listArticle(Scanner sc) {
		
		if(boardList.size() > 0) {
			
			for(int i = 0; i < boardList.size(); i++) {
				System.out.println(boardList.get(i));
			}
			
			
			// HashMap ���
//			for(int i = 0; i < boardList.size(); i++) {
//				System.out.println(
//						"register : " + boardList.get(i).get("register") + 
//						"subject : " + boardList.get(i).get("subject") + 
//						"email : " + boardList.get(i).get("email") + 
//						"content : " + boardList.get(i).get("content") 
//				);
//			}
		} else {
			System.out.println("�շϵ� �Խñ��� �����ϴ�.");
		}
		
	}
	
	// �ۻ���
	
	public void removeArticle(Scanner sc) {
		
		System.out.println("�Խñ��� �����Ҷ��� ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("�ۼ��� : ");
		String name = sc.next();
		System.out.print("��й�ȣ : ");
		String passwd = sc.next();
		
		removeArticle(name, passwd);
		
	}
	
	public void removeArticle(String register, String passwd) {
		// ���� ���
		if(boardList.size() > 0) {
			int index =- 1;
			
			for(int i = 0; i < boardList.size(); i++) {
				if(boardList.get(i).getRegister().equals(register)) { // �ۼ��ڰ� �´� ���
					if(boardList.get(i).getPasswd().equals(passwd)) { // ��й�ȣ�� �´� ���
						boardList.remove(boardList.get(i));
						index = i;
					}
				}
			}
			
			// HashMap ���
//			for(int i = 0; i < boardList.size(); i++) {
//				if(boardList.get(i).get("register").equals(register)) { // �ۼ��ڰ� �´� ���
//					if(boardList.get(i).get("passwd").equals(passwd)) { // ��й�ȣ�� �´� ���
//						boardList.remove(boardList.get(i));
//						index = i;
//					}
//				}
//			}
			if(index == -1) { // �ε����� ���� ���
				System.out.println("�ش� �ۿ� �ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				return;
			}
			
		} else {
			System.out.println("�շϵ� �Խñ��� �����ϴ�.");
		}
		
		
	}
	
}

