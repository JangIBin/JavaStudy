package study;


import java.io.IOException;

public class Test0425_01 {

	public static void main(String[] args) throws IOException {
		
		char ch, s;
		
		
		System.out.print("¾ËÆÄºª ¹®ÀÚ ÀÔ·Â : ");
		ch = (char)System.in.read();
		
		if(ch >= 'a' && ch <= 'z' ) {
//			ch -= 32;
			s = (char)(ch-32);
			System.out.println(s);
		} else if(ch >= 'A' && ch <= 'Z') {
//			ch += 32;
			s = (char)(ch+32);
			System.out.println(s);
		} else {
			System.out.println("¾ËÆÄºªÀÌ ¾Æ´Õ´Ï´Ù.");
		}
//		
//		s = (ch >= 'a' && ch <= 'z') ? 
//				(char)(ch-32) : (ch >= 'A' && ch <= 'Z') ? (char)(ch-32) : 'x';
//		System.out.println(s);
		
		
	}
	
}
