package com.constex;

class BookEx {
	String title;
	String author;
	
	public void show() {
		System.out.println(title + " " + author);
	}
	
	public BookEx() {
		this("", "");
		System.out.println("������ ȣ����");
	}
	
	public BookEx(String title) {
		this(title, "�۰� �̻�");
	}
	
	public BookEx(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
}

public class ThisEx03 {

	
	 
	public static void main(String[] args) {

		BookEx be = new BookEx("����", "������");
		BookEx be2 = new BookEx("����");
		BookEx be3 = new BookEx();
		
		be.show();
		be2.show();
		be3.show();
		
	}

}