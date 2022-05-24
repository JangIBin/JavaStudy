package study;
import java.util.*;

public class WhileExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// 변수 선언
		// low, high, card
		int low, high, card;
		
		// y/n 문자열이 들어오면 게임을 반복진행 여부를 판정
		while(true) {
			int i = 0; // 사용자의 시행 횟수
			low = 0; // 카드 값의 최소 범위
			high = 99; // 카드값의 최대 범위
			
			// 0과 99 사이의 정수(난수)값을 생성(숨김값)
			card = r.nextInt(100);
			System.out.println("숨겨져 있는 카드 값을 맞추어 보세요.");
			
			while(true) {
				System.out.println("입력하실 수 있는 값의 범위 " + low + "~" + high+" 입니다.");
				
				int n = 0;
				n = sc.nextInt(); // 값을 입력받음
				
				//입력안 값이 범위를 벗어난 경우와 정상적인 경우 판정
				if(n > high || n < low) {
					System.out.println("입력하신 값은 범위를 초과하였습니다.");
				} else {
					if(n == card) {
						System.out.println("맞추셨습니다. 축하드립니다.");
						break;
					} else if(n > card) { // 입력된 값이 숨겨진 카드값보다 큰 경우
						System.out.println("더 낮은 값을 입력하시오.");
						high = n;
					} else { // 입력된 값이 숨겨진 카드값보다 작은 경우
						System.out.println("더 큰 값을 입력하시오.");
						low = n;
					}
				}
				
				
			} // 안쪽 end while
			
			System.out.println("계속 게임을 진행 하시겠습니까?(y/n)");
			if(sc.next().equals("n"))
				break;
			
		} // 바깥쪽 end while
		
	}

}
