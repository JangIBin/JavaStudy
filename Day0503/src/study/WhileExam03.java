package study;

public class WhileExam03 {

	public static void main(String[] args) {
		
		int i = 1, j = 1, sum = 0;
		
		while(i <= 100) {
			j = -j;
			System.out.println(j);
			sum += j*(i*i);
			i++;
		}
		System.out.println(sum);
	}
}
