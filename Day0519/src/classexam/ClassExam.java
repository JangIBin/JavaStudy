package classexam;

import java.io.*;

public class ClassExam {
	
	private int x;
	private int y;
	private BufferedReader br;
	
	public ClassExam() {
		br = new BufferedReader(new InputStreamReader(System.in));
		x = 0;
		y = 0;
		
	}
	
	public void setX() throws IOException {
		
		System.out.print("x : ");
		x = Integer.parseInt(br.readLine());
		
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setY() throws IOException {
		
		System.out.print("y : ");
		y = Integer.parseInt(br.readLine());
	}
	
	public void display() {
		System.out.println();
		System.out.print("???? ??ǥ (x, y) : ");
		System.out.println("("+x+", "+y+")");
		System.out.println();
	}

}
