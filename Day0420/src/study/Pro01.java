package study;

/*
 * 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 짝수인지 홀수인지를 판정하는 프로그램을 작성하시오.
 * 단, 조건삼항연산자를 이용하여 처리하시오.
 * 
 */



import java.util.*;

public class Pro01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String exm;
		
		System.out.print("점수입력 : ");
		num = sc.nextInt();
		
		//삼항연산자
		exm = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(exm);
		
		//if문
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}

}
