package study;

/*
 * ����ڷκ��� ������ ������ �Է¹޾� �Է¹��� ������ ¦������ Ȧ�������� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, ���ǻ��׿����ڸ� �̿��Ͽ� ó���Ͻÿ�.
 * 
 */



import java.util.*;

public class Pro01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		String exm;
		
		System.out.print("�����Է� : ");
		num = sc.nextInt();
		
		//���׿�����
		exm = (num % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(exm);
		
		//if��
		if(num % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
	}

}
