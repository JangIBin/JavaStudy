package com.ioex;

import java.io.*;

public class FileCopyEx01 {

	public static void main(String[] args) {
		
		System.out.println("Start Copy File...");
		long start = System.currentTimeMillis();
		
		long end = System.currentTimeMillis();
		
		FileInputStream src = null;
		FileOutputStream dest = null;
		
		try {
			
			// 원본 파일을 읽기 위한 FileInputStream 객체 생성
			src = new FileInputStream(new File("c:/windows/win.ini"));
			// 복사파일을 생성하기 위한 FileOutputStream 객체 생성
			dest = new FileOutputStream(new File("c:/ppp/dest.txt"));
			
			// FileInputStream을 통해서 읽어들인 값을 저장할 변수 선언
			int readValue = 0;
			// FileInputStream의 read()메소드를 통해서 읽어들인 값을 readValue에 저장
			while ((readValue = src.read()) != -1) {
				// readValue에 저장된 값을 FileOutputStream의 write()메소드를 통해서 파일에 저장
				dest.write(readValue);
			}
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(dest != null) {
					dest.close();
				}
			} catch (IOException ii) {
				ii.printStackTrace();
			}
			try {
				if(src != null) {
					src.close();
				}
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}
		
		long copyTime = (end - start) / 1000;
		System.out.println("복사에 걸린 시간 : " + copyTime);
		
	}

}
