package study;

public class ArrayEx01 {

	public static void main(String[] args) {
		
//		int[] score = new int[5];
		int[] score;
		score = new int[5];
		
		score[0] = 10;
		score[1] = 10;
		score[2] = 10;
		score[3] = 10;
		score[4] = 10;
		
		
		int sum = score[0] + score[1] + score[2] + score[3] + score[4];
		sum = 0;
		for(int i=0; i<5; i++) {
			sum = sum+score[i];
		}
		System.out.println(sum);
		for(int i=0;i<score.length;i++ ) {
			System.out.printf("score[%d]:%2d\n",i, score[i]);
		}

	}

}
