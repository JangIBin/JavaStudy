package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_week {
	public static void main(String[] args) throws IOException{
		
		char al;
		String exm;
		String test;

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("���ĺ��� �Է��ϼ��� : ");
		al = (char)System.in.read();
		System.in.read(); //\r
		System.in.read(); //\n
		
		exm = ((al >= 'a' && al <= 'z') || (al >= 'A' && al <= 'Z')) ? 
				(al == 'a' || al == 'i' || al == 'u' || al == 'e' || al == 'o' || al == 'A' || al == 'I' || al == 'U' || al == 'E' || al == 'O') ? 
						"����" : "¦��" : "�Է� ����";
		
		System.out.println(exm);
		
	}

}
