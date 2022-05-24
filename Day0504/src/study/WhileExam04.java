package study;
import java.util.*;

public class WhileExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		// ���� ����
		// low, high, card
		int low, high, card;
		
		// y/n ���ڿ��� ������ ������ �ݺ����� ���θ� ����
		while(true) {
			int i = 0; // ������� ���� Ƚ��
			low = 0; // ī�� ���� �ּ� ����
			high = 99; // ī�尪�� �ִ� ����
			
			// 0�� 99 ������ ����(����)���� ����(���谪)
			card = r.nextInt(100);
			System.out.println("������ �ִ� ī�� ���� ���߾� ������.");
			
			while(true) {
				System.out.println("�Է��Ͻ� �� �ִ� ���� ���� " + low + "~" + high+" �Դϴ�.");
				
				int n = 0;
				n = sc.nextInt(); // ���� �Է¹���
				
				//�Է¾� ���� ������ ��� ���� �������� ��� ����
				if(n > high || n < low) {
					System.out.println("�Է��Ͻ� ���� ������ �ʰ��Ͽ����ϴ�.");
				} else {
					if(n == card) {
						System.out.println("���߼̽��ϴ�. ���ϵ帳�ϴ�.");
						break;
					} else if(n > card) { // �Էµ� ���� ������ ī�尪���� ū ���
						System.out.println("�� ���� ���� �Է��Ͻÿ�.");
						high = n;
					} else { // �Էµ� ���� ������ ī�尪���� ���� ���
						System.out.println("�� ū ���� �Է��Ͻÿ�.");
						low = n;
					}
				}
				
				
			} // ���� end while
			
			System.out.println("��� ������ ���� �Ͻðڽ��ϱ�?(y/n)");
			if(sc.next().equals("n"))
				break;
			
		} // �ٱ��� end while
		
	}

}
