package com.ioex;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("c:/ppp/fileout.txt");
			String message = "Work hard Java Programming !!!";
			fos.write(message.getBytes());
			fos.close();
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		
	}

}
