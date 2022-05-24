package study;

import java.util.Scanner;

/*
 *  콜라, 사이다, 마운틴, 초코송이, 에이스, 웨하스가 나오는 자판기 프로그램을 구현하시오
 */

public class WhileExam06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String prd, ext="";
		
		System.out.println("1.콜라\t2.사이다\t3.마운틴\t4.초코송이\t5.에이스\t6.웨하스\n");
		
		while(true) {
			System.out.print("상품을 하나 골라주세요 : ");
			prd = sc.next();
			
			switch(prd) {
				case "콜라":
					ext="콜라";
					break;
				case "사이다":
					ext="사이다";
					break;
				case "마운틴":
					ext="마운틴";
					break;
				case "초코송이":
					ext="초코송이";
					break;
				case "에이스":
					ext="에이스";
					break;
				case "웨하스":
					ext="웨하스";
					break;
				default:
					System.out.println("상품이 없거나 잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
			}
			if(ext!="") {
				break;
			}
			
		}
		System.out.println(ext+"을(를) 선택하셨습니다.");
		
	}

}
