package study;

import java.util.*;

/*
 *  숨겨진 카드 수를 맞추는 게임
 *  
 *  0에서 부터 99까지 임의의 수를 가진 카드를 한장 숨기고
 *  이 카드 수를 맞추는 게임임
 *  카드속의 수가 77이라면 수를 맞추는 사람이 55를 입력하면
 *  더 높게 다시 입력하라고 하며 범위를 좁혀가며 숫자를 맞추는 게임
 *  게임을 반복하기 위해 y/n을 묻고, n인 경우는 종료함
 */

public class WhileExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int i = r.nextInt(100);
		
		int num = 0;
		char c;
		
		while(true) {
			System.out.print("(0~99)숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num > i) {
				System.out.println("더 작게 입력주세요.");
			} else if(num < i) {
				System.out.println("더 높게 입력해주세요");
			} else {
				System.out.println("맞추셨습니다.");
				System.out.print("다시 하시겠습니까?(y/n) : ");
				c = sc.next().charAt(0);
				if(c=='y') {
					i = r.nextInt(100);
				} else if (c=='n') {
					return;
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
		}
	}
}
