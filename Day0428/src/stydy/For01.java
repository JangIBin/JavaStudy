package stydy;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int  num, sum=1;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(;num>0;num--) {
			sum = sum*num;
		}
		System.out.println(sum);
		
		for(int i = 1;i <= num;i++) {
			sum = i*sum;
		}
		System.out.println(sum);
		
		
//		for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                    System.out.print("*");
//            }
//            System.out.println();
//		}
//		//반대로
//		for (int i = 0; i < 5; i++) {
//	        for (int j = 0; j < 5; j++) {
//	          System.out.print((j < (4 - i)) ? " " : "*");
//	        }
//	        System.out.println();
//		}
//		//피라미드
//		 for (int i = 0; i < 5; i++) {
//			 for (int j = 0; j < (5+i); j++) {                       
//            	 System.out.print((j < (4 - i)) ? " " : "*"); 
//             }
//             System.out.println();
//		 }
		
	}

}
