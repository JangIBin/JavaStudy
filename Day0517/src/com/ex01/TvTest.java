package com.ex01;

public class TvTest extends Tv{
	

	public static void main(String[] args) {

		// Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� �����ߴ�.
		Tv t;
		t = new Tv(); // �ν��Ͻ��� ����(�ν��Ͻ� = ��ü)
		t.channel = 24; // Tv��ü�� ������� ä�� ���� 24�� �����ߴ�.
		t.channelDown(); // 23 : ���մ���
		System.out.println("���� ä���� "+t.channel+"�Դϴ�.");
		
	}

}