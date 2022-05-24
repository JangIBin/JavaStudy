package study;

import java.io.*;

/*
 *  사용자가 입력하는 정수를 계속해서 더해 나아감
 *  만약 0이 입력되면 지금까지 입력된 정수의 덧셈 결과를 출력하고 종료함
 */

public class WhileExam02 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 1, sum=0;
		
		while(num!=0) {
			System.out.print("정수 입력 : ");
			num = Integer.parseInt(br.readLine());
			sum = sum + num;
			
		}
		System.out.print("총 덧셈 결과 : "+sum);
		
	}

}
