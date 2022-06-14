package com.ioex;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {

		FileInputStream fls = null;
		
		// 파일을 읽기 위한 배열 선언
		byte _read[] = new byte[100];
		// 키보드 입력한 값을 읽어서 console 배열에 저장
		byte _console[] = new byte[100];
		
		try {
			System.out.print("파일명 : ");
			System.in.read(_console);
			
			String file = new String(_console).trim();
			
			fls = new FileInputStream(file);
			fls.read(_read, 0, _read.length);
			System.out.println(new String(_read).trim());
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				fls.close();
			} catch (IOException ii) {
				ii.printStackTrace();
			}
		}
		
	}

}
