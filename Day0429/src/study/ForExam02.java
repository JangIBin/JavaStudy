package study;

public class ForExam02 {

	public static void main(String[] args) {

//		for (int i = 0; i < 5; i++) {
//            for (int j = 1; j < 6; j++) {
//            	System.out.print((j < (5-i)) ? " " : 6-j);
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+1);
//            }
//            System.out.println();
//		}
		
		final int max = 10;
		
		for(int i=0; i<=max;i++) {
			for(int j = max; j>= -max;j--) {
				if(Math.abs(j) > i) {
					System.out.print(" ");
				} else {
					System.out.printf("%d",Math.abs(j));
				}
			}
			System.out.println();
		}
		
//		for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//            	if(j < 4-i) {
//            		System.out.print("  ");
//            	} else {
//            		System.out.print("*");
//            	}
//            }
//            System.out.println();
//		}
		
//		for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//            	System.out.print((j < (4 - i)) ? "  " : "*");
//            }
//            System.out.println();
//		}
		
	}

}
