package com.classex;

import java.io.*;

public class Banking {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Account na = new Account("����");
		
		String strWork;
		
		do {
			
			System.out.println("�۾��� �����ϼ���");
			System.out.println("=======================");
			System.out.println("1.�Ա�");
			System.out.println("2.���");			
			System.out.println("3.�ܾ� ��ȸ");
			System.out.println("0.����");
			System.out.println("=======================");
			
			System.out.print("�۾� ������ �����ϼ��� : ");
			strWork = br.readLine();
			
			int switchInt = 0;
			
			if(strWork != null) { // !null(�޴��� ���õǾ��� ��)
				switchInt = Integer.parseInt(strWork);
			} else { //null
				System.out.println("�۾� ������ �Է����� �����̽��ϴ�.");
				System.exit(0);
			}
			
			switch (switchInt) {
			case 0: // ����
				System.out.println("���α׷� ����");
				break;
			case 1: // �Ա�
				System.out.println("\n=======================");
				System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ��� : ");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);
				break;
			case 2: // ���
				System.out.println("\n=======================");
				System.out.println("����Ͻ� �ݾ��� �Է��ϼ��� : ");
				String strwithDrawIn = br.readLine();
				long withDrawLong = Long.parseLong(strwithDrawIn);
				na.withdraw(withDrawLong);
				break;
			case 3: // �ܰ�Ȯ��
				System.out.println(na.getName()+"���� �ܰ���" + na.getBalance() + "���Դϴ�.");
				break;
			default:
				System.out.println("0 ~ 3�� ������ ���ڸ� �Է����ּ���.\n");
				break;
			}
			
			
		} while(!strWork.equals("0"));
		
	}

}