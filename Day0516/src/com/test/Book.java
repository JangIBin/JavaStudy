package com.test;

public class Book { //Ŭ���� ���(Ŭ���� ��)
	
	// ��� �ʵ�(����, ���), �Ӽ�
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	//������
	public Book() { // �⺻ ������
		
	}
	
	// ������
	public Book(String name, String writer, int price, int nowPage, String isbn) {
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.nowPage = nowPage;
		this.isbn = isbn;
	}
	
	// �޼ҵ�(����, ����)
	public void nextPage() {
		nowPage++;
	}
	public void previousPage() {
		nowPage--;
	}

}