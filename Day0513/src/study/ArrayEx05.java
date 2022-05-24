package study;

import java.io.*;

/*
 *  ��]
 *  �迭�� �̿��Ͽ� �Ѹ��� �л��� ���� ����ó�� ���α׷��� �ۼ��Ѵ�.
 *  
 *  ���� ��, ���� ��
 *  �̸��� �Է�
 *  
 *  �̸�, �����, ����, ���, ����
 *  
 */

public class ArrayEx05 {

	public static void main(String[] ar) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �̸� �Է� ����
		System.out.print("�̸� �Է� : ");
		String name = br.readLine();
//		String[] subject = new String[ar.length];
		String[] subject = {"����", "����", "����"};
		
		
		int jumsu[] = new int[subject.length+1];
		
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "����: ");
			jumsu[i] = Integer.parseInt(br.readLine());
			// ������
			jumsu[jumsu.length-1] = jumsu[i];
//			System.out.println("���� : " + jumsu[jumsu.length-1]);
		}
		
		float avg = jumsu[jumsu.length-1]/(float)(subject.length);
		// �Ҽ��� 3�ڸ����� �ݿø� �ݿ�
		avg = (int)((avg+0.005)*100)/100.f;
		
		char grade = 0;
		switch ((int)(avg/10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("------------   "+name+"���� �� �� ǥ   ------------");
		System.out.println();
		System.out.println("--------------------------------------------");
		
	}

}
