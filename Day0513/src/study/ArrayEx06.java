package study;

import java.io.*;

public class ArrayEx06 {

	public static void main(String[] ar) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�л� �� �Է� : ");
		int human = Integer.parseInt(br.readLine()); // ��� �� ���ϱ�
		
		String[] name = new String[human];
		String[] subject = {"����", "����", "����"}; // ����� �ʱ�ȭ
		// ������ ���� ó�� �迭����
		int[][] jumsu = new int[human][subject.length-1];
		float[] avg = new float[human];
		char[] grade = new char[human];
		int[] rank = new int[human];
		
//		for(int i = 0; i < subject.length; i++) {
//			System.out.println(subject[i]);
//		}
		
		for(int i = 0; i < human; i++) {
			System.out.println((i+1)+"��° �л� �̸�: ");
			name[i] = br.readLine();
			
			System.out.println(name[i]+"�л� ���� �Է�: ");
			for(int j = 0; j < subject.length; j++) {
				System.out.println(subject[j]="���� : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
			}
			
		}
		
	}

}
