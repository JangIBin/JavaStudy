package study;

import java.util.Scanner;

/*
 *  �ݶ�, ���̴�, ����ƾ, ���ڼ���, ���̽�, ���Ͻ��� ������ ���Ǳ� ���α׷��� �����Ͻÿ�
 */

public class WhileExam06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String prd, ext="";
		
		System.out.println("1.�ݶ�\t2.���̴�\t3.����ƾ\t4.���ڼ���\t5.���̽�\t6.���Ͻ�\n");
		
		while(true) {
			System.out.print("��ǰ�� �ϳ� ����ּ��� : ");
			prd = sc.next();
			
			switch(prd) {
				case "�ݶ�":
					ext="�ݶ�";
					break;
				case "���̴�":
					ext="���̴�";
					break;
				case "����ƾ":
					ext="����ƾ";
					break;
				case "���ڼ���":
					ext="���ڼ���";
					break;
				case "���̽�":
					ext="���̽�";
					break;
				case "���Ͻ�":
					ext="���Ͻ�";
					break;
				default:
					System.out.println("��ǰ�� ���ų� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					break;
			}
			if(ext!="") {
				break;
			}
			
		}
		System.out.println(ext+"��(��) �����ϼ̽��ϴ�.");
		
	}

}
