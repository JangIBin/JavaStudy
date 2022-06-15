package com.ioex;

/*
	DataInputStream�� DataOutputStream
	
	DataOutputStream
	- Ư�� ������ Ÿ�԰� ������ ������ä �����͸� ����ϰ� �о� �� �� �ִ� ��Ʈ��
	- Ư�� ������ Ÿ�԰� ���信 �°� �а� �� �� �ִ� �޼ҵ带 ������
	  writeBoolean, readBoolean, readInt, writeInt, readUTF, writeUTF
	
 */

import java.io.*;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// DataOutputStream�� �⺻ �ڷ��� Ÿ�� �״�� ��Ʈ���� ���ؼ� ����� �� ����
		// DataOutputStream�� 1�� ��Ʈ���� �ƴϱ� ������ �ٸ� ��Ʈ���� �̿��ؼ� Ư�� ��ġ�� ������ �� �ִ�.
		DataOutputStream dos = null; // 2��
		FileOutputStream fos = null; // 1��
		
		try {
			// DataOutputStream�� ����� FileOutStream
			fos = new FileOutputStream("c:/ppp/data.sav");
			// �⺻ �ڷ����� Ÿ���� ������ä ����� �� �ִ� DataOutputStream ��ü ����
			dos = new DataOutputStream(fos);
			
			int i = 10;
			double d = 3.14;
			String s = "I like potato";
			// DataOutputStream�� �⺻ �ڷ������� �����ϴ� write �޼ҵ尡 ������
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
			try {
				if(dos != null) {
					dos.close();
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		
		
	}

}
