package com.ioex;

import java.io.*;

public class ObjectInputStreamEx {

	public static void main(String[] args) {

		ObjectInputStream ois = null;
		
		try {
			// ���Ͽ� ����� ��ü�� �о���� ���� ObjectInputStream ��ü�� ����
			ois = new ObjectInputStream(new FileInputStream("c:/ppp/obj.oob"));
			
			// ObjectInputStream�� ��Ʈ�����κ��� �о���� ����ȭ�� ��ü�� ������ȭ�ؼ� ��ü�� ������ �� ����
			// ������ȭ�Ҷ� �ʿ��� Ŭ������ ã�� ���ϸ� ����(ClassNotFoundException)�� �߻���
			
			Data data = (Data)ois.readObject();
			System.out.println("��ȣ : " + data.getNo());
			System.out.println("�̸� : " + data.getName());
			System.out.println("���� : " + data.getMail());
			
			
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			// ���� �߿�!
			try {
				if(ois != null) {
					ois.close();
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		
	}

}