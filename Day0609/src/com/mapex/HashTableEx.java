package com.mapex;

import java.util.*;

public class HashTableEx {
	
	private static final String name[] = {"����", "������", "����", "���", "�����", "ȣ��"};
	private static final String tel[] = {
			"111-1111",
			"222-2222",
			"333-3333",
			"555-5555",
			"666-6666",
			"555-5555"
	};

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<>();
		
		// �ؽ� ���̺��� Ű, ������ �Է�
		for(int i = 0; i < name.length; i++) {
			ht.put(name[i], tel[i]);
		}
		
//		System.out.println(ht);
		String str = ht.get("����");
		if(str != null) {
			System.out.println("������ ��ȭ��ȣ : " + str);
		}
		
		// Ű�� �����ϴ��� �˻�
		if(ht.containsKey("������")) {
			System.out.println("������ �ڷᰡ �����մϴ�.");
		} else {
			System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
		}
		
		// ���� �����ϴ��� �˻�
		if(ht.containsValue("555-5555")) {
			System.out.println("�ڷᰡ �����մϴ�.");
		} else {
			System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
		}
		
		ht.remove("ȣ��");
		
		if(ht.contains("ȣ��")) {
			System.out.println("ȣ�� �ڷᰡ �����մϴ�.");
		} else {
			System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
		}
		
	}

}