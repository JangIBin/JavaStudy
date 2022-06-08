package com.boardex;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {

		boolean isStop = false;
		
		Scanner sc = new Scanner(System.in);
		BoardSVC boardSVC = new BoardSVC();
		
		do {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1. �Խ��� �۾���");
			System.out.println("2. �Խ��� �� ��� ����");
			System.out.println("3. �Խ��� �� ����");
			System.out.println("4. �Խ��� ����");
			
			String menu = sc.next();
			
			switch (menu) {
			case "1":
				boardSVC.wirteArticle(sc);
				break;
			case "2":
				boardSVC.listArticle(sc);
				break;
			case "3":
				boardSVC.removeArticle(sc);
				break;
			case "4":
				isStop = true;
				break;
			default:
				break;
			}
			
			
		} while (!isStop);
		
	}

}
