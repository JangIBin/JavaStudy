package study;

import java.io.IOException;

public class Test04 {

	public static void main(String[] args) throws IOException {

		char ch; //���ڸ� ������ ����
		String s = ""; // ����� ������ ����(�����̳� �����̳�)
		
		System.out.print("���ĺ� ���� �Է� : ");
		ch = (char)System.in.read();
		
		s= ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z')) ? 
				((ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') || 
						(ch == 'A' || ch == 'I' || ch == 'U' || ch == 'E' || ch == 'O')) ? "����" : "����": "���ĺ��� �ƴմϴ�";
		System.out.println(s);
		
	}

}
