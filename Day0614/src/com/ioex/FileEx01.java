package com.ioex;

import java.io.*;

public class FileEx01 {

	public static void main(String[] args) {

		// File f = new File("c:\\ppp\\hello.txt");
		File f = new File("c:/ppp/hello.txt");
		
		System.out.println("�������� ���� : " + f.isFile());
		System.out.println("���丮���� ���� : " + f.isDirectory()); // ���丮 -> ����
		
		// ����� : ���� ��ġ�� �������� �� ���� ��ġ�� �ǹ���
		// ������ : ��� ��� c:/ppp/hello.txt
		// .
		// .. : ���� ��ġ�� �ٷ� ������ ���丮�� �̹�
		// / : ��Ʈ
		
		System.out.println("��� ��� : " + f.getPath());
		System.out.println("���� ��� : " + f.getAbsolutePath());
		System.out.println("������ �̸� : " + f.getName());
		System.out.println("������ ���� : " + f.length());
		System.out.println("������ ���� ���� ��¥ : " + f.lastModified());
		
	}

}
