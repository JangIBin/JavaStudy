package com.threadex;

class ThreadEx03 extends Thread {
	
	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(150);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}

public class ThreadExam01 {

	public static void main(String[] args) {
		
		ThreadEx03 t3 = new ThreadEx03();
		t3.start();

		for(int i = 0; i < 60; i++) {
			System.out.println(i);
			try {
				Thread.sleep(150);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	}

}
