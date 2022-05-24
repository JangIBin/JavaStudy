package study;

/*
 * -50에서 1까지의 수를 출력하는 프로그램
 * 단, 한줄에 5개씩만 출력하시고, 이 수들 사이를 탭 간격으로 띄우시오. 
 */



public class WhileExam05 {

	public static void main(String[] args) {

		int i=-50, count=1;
		
		while(i<=1) {
			
			System.out.print((count%5==0)?(i+"\n"):(i+"\t"));
			
			i++;
			count++;
		}
		
	}

}
