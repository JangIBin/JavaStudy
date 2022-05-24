package study;

/*
 * float, double : 실수형 (실수형의 기본형은 double)
 */

import java.lang.*;

public class FloatEx {

	public static void main(String[] args) {
		
		double var1, var2;
		long d2 = 3333333333333333333l; // long범위를 벗어났을때 뒤에l을 붙인다 단 19자리 이상이 가면 에러발생
		
		var1 = 3.1f; // float로 정의하고 숫자를 대입할땐 꼭 실수뒤에 소문자f를 붙여준다
		var2 = 5.55;
//		System.out.println(var1);
		
		// 1. 변수선언 및 초기화
		 int r = 0;
		 double w = 0, h = 0;

		 // 2. 연산 및 처리
		 r = 5;
		 w = r*r*Math.PI;
		 h = 2*r*Math.PI;
		 
		 
		 System.out.println("원의 넓이 =" + w);
		 System.out.printf("원의 넓이 = %.3f\n", w);
		 System.out.println("원의 둘레 =" + h);

	}

}
