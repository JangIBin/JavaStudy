package com.hw;
//�߻� Ŭ������ ��ӹ޾� �����ϴ� ����ü(����Ŭ����)
public class Piano extends Instrument {

	public static void main(String[] args) {
		
		Piano p = new Piano();
		p.play();
		p.volumeUp();
		p.volumeDown();
	}
	
	@Override
	void play() { // �ν��Ͻ� �޼ҵ�
		System.out.println("Piano : play() ȣ���");
	}
	
	@Override
	void volumeUp() {
		System.out.println("Piano : volumeUp() ȣ���");
	}
	
	@Override
	void volumeDown() {
		System.out.println("Piano : volumedOWN() ȣ���");
	}

}
