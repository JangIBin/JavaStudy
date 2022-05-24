package methodex;

/*
 *  ���� ���� ���
 *   1. �ִ��
 *   2. ������ �հ�
 *   3. ����
 *   4. ����
 */

import java.io.*;

public class MethodEx03 {
	
	// �ִ밪 ���ϴ� �޼ҵ� �ۼ�
	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ù ��° �� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° �� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		
		if (a > b) {
			return a;
		} else {
			return b;	
		}
	} // end
	
	// �� �� ������ ���� ���ϴ� �޼ҵ�
	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ù ��° �� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° �� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		
		// ���� ���� ����
		int tot = 0;
		if(a > b ) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		
		for(int i = a; i <= b; i++) {
			tot += i;
		}
		
		System.out.println(a+"�� "+b+" �� �� ������ �հ� : "+tot);
		
	} // end
	
	// ū ������� �����ϴ� ������ ���ϴ� �޼ҵ�
	public static String ccc(int x, int y, int z) { // fst = x, scd = y, trd = z
		
		if(y >= x && y >= z) {
			//swap 
			int imsi = x;
			x = y;
			y = imsi;
			
		} else if(z >= x && z >= y) {
			int imsi = x;
			x = z;
			z = imsi;
			
		} 
		if(z >= y) {
			int imsi = y;
			y = z;
			z = imsi;
		}
		
		String result = x + " >= " + y + " >= " + z;
		
		return result ;
	}
	

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0;
		
		while(true) {
			System.out.println("�Է�(1.�ִ�� 2.�� �� ������ �հ� 3.���� 4.���� )");
			x = Integer.parseInt(br.readLine());
			
			if(x==1) { // return ���� ���´�.
				int k = aaa();
				System.out.println("�� ���� �ִ밪�� "+k+"�Դϴ�.");
			} else if(x==2) {
				bbb();
			} else if(x==3) {
				System.out.print("ù ��° �� �Է� : ");
				int fst = Integer.parseInt(br.readLine());
				System.out.print("�� ��° �� �Է� : ");
				int scd = Integer.parseInt(br.readLine());
				System.out.print("�� ��° �� �Է� : ");
				int trd = Integer.parseInt(br.readLine());
				System.out.println(ccc(fst, scd, trd));
				
			} else if(x==4) {
				break;
			} else { 
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
			System.out.println();
		}
		System.out.println("���� �ϼ̽��ϴ�.");
		
	}
	
}