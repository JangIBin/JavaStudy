package study;

import java.io.*;

/*
 *  ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ���ư�
 *  ���� 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ ���� ����� ����ϰ� ������
 */

public class WhileExam02 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 1, sum=0;
		
		while(num!=0) {
			System.out.print("���� �Է� : ");
			num = Integer.parseInt(br.readLine());
			sum = sum + num;
			
		}
		System.out.print("�� ���� ��� : "+sum);
		
	}

}
