package com.ioex;

import java.io.*;
// �ؽ�Ʈ���Ͽ� ���� ���
public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {
		
		// Buffered ��Ʈ�� : ��Ʈ���� �а� ���� ����� ���� ��Ʈ�� ������ ���۸� ������ �ִ� ��Ʈ��
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		FileInputStream fis = new FileInputStream("c:/ppp/hello.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	
		try {
			fw = new FileWriter("c:/ppp/hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("������ ������ �帮�׿�!");
			bw.newLine();
			bw.write("���ڰ� �԰� �;��!");
			bw.write("������ �Ⱦ��!");
			bw.flush();
			
			
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		
	}

}
