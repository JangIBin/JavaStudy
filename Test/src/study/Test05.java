package study;

import java.io.IOException;

public class Test05 {

	public static void main(String[] args) throws IOException{
		
		char ch, s;
		int n;
		
		System.out.print("���ĺ� ���� �Է� : ");
		n = (char)System.in.read();

		// �빮�ڸ� �Է¹޾��� ��� �ҹ��ڷ� ��ȯ
		// �ҹ��ڸ� �Է� �޾��� ��� �빮�ڷ� ��ȯ
		
		// 1. �Է°��� �빮�� ���
		
		if (n >= 65 && n <= 90) {
			n += 32;// n���� 32��ŭ ������Ŵ
			ch = (char)n;
			System.out.println(ch);
		} else if (n >= 97 && n <= 122) {
			n -= 32;// n���� 32��ŭ ������Ŵ
			ch = (char)n;
			System.out.println(ch);
		} else { //�Է°��� ���ĺ��� �ƴ϶�� �Է¿��� ���
			System.out.println("�Է� ����");
		}
		
		ch = (n >= 'a' && n <= 'z') ? 
		(char)(n-32) : (n >= 'A' && n <= 'Z') ? (char)(n-32) : 'x';
		System.out.println(ch);
		
		
	}

}
