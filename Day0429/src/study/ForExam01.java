package study;

public class ForExam01 {

	public static void main(String[] args) {

		// 변수 선언
		int i, j; // i : 단, j : 내부에서 1~9 반복처리
		
		for(i=2;i<=9;i++) {
			for (j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		
		//다이아
//		for (int i = 0,j=0; i < 9; i++) {
//			for (int k = 0; k < j+5; k++) {                       
//				System.out.print((k < (4 - j)) ? "  " : "*"); 
//			}
//			if (i < 4) {
//                j++;
//			} else {
//                j--;
//			}
//	        System.out.println();
//		}
		//모래 시계
//		for (int i = 0, j=0; i < 9; i++) {
//            for (int k = 0; k < (9 - j); k++) {
//            	System.out.print((k < j) ? "  " : "*");
//            }
//            if(i < 4){
//            	j++;
//            }else{
//            	j--;
//            }
//            System.out.println();
//		}
	
