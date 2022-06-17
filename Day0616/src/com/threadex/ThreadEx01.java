package com.threadex;

public class ThreadEx01 extends Thread {
	
	private int[] temp;
	
	public ThreadEx01(String threadname) {
		super(threadname);
		temp = new int[10];
		for(int start = 0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	@Override
	public void run() {
		for(int start : temp) {
			try {
				sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			System.out.printf("Thread name : %s, ", currentThread().getName());
			System.out.printf("Temp value : %d\n", start);
		}
		
	}

	public static void main(String[] args) {

		ThreadEx01 te = new ThreadEx01("GamJa");
		te.start();
		
	}

}
