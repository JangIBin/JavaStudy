package study;

/*
 * return 뒤에 아무것도 붙이지 않는 것은 현재 메소드인 main()의 형식이 void로 지정되었기 때문이다.
 * void는 아무것도 없다는 의미이다. 즉 return 뒤에 붙이는 값은 현재 메소드의 데이터형(이 경우에는 void형)과 일치해야 한다.
 * 만약 main메소드가 int main()과 같이 되어 있다면 return 0;과 같이 정수형 값을 써야한다.
 */

public class ForExam01 {

	public static void main(String[] args) {
		// 1부터 10까지의 합계 : 55
		// 변수 선언
		int i, sum = 0;
		
		for(i = 1; i <= 10; i ++) {
			sum = sum + i;
			System.out.println(i+"이면 "+sum+"입니다.");
		}
		
		
	}

}
