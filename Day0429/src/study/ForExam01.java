package study;

public class ForExam01 {

	public static void main(String[] args) {

		// ���� ����
		int i, j; // i : ��, j : ���ο��� 1~9 �ݺ�ó��
		
		for(i=2;i<=9;i++) {
			for (j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		
		//���̾�
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
		//�� �ð�
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
	