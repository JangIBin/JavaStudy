package com.ioex;

import java.io.*;
// 텍스트파일에 문자 기록
public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {
		
		// Buffered 스트림 : 스트림의 읽고 쓰는 기능을 위해 스트림 내부의 버퍼를 가지고 있는 스트림
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		FileInputStream fis = new FileInputStream("c:/ppp/hello.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	
		try {
			fw = new FileWriter("c:/ppp/hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("오늘은 날씨가 흐리네요!");
			bw.newLine();
			bw.write("감자가 먹고 싶어요!");
			bw.write("고구마는 싫어요!");
			bw.flush();
			
			
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		
	}

}
