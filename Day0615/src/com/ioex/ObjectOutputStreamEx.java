package com.ioex;

import java.io.*;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		
		ObjectOutputStream oos = null;
		
		try {
			// 메모리에 생성된 객체를 직렬화 해서 스트림을 통해서 기록할 수 있는 ObjectOutputStream를 생성
			oos = new ObjectOutputStream(new FileOutputStream("c:/ppp/obj.oob"));
			
			// ObjectOutputStream을 통해서 직렬화된 후 파일로 기록될 Data 객체 생성
			// 객체를 생성하기전 반드시 Serializable을 구현하고 있어야함
			
			Data data = new Data();
			data.setNo(30);
			data.setName("홍길동");
			data.setMail("hong@naver.com");
			// ObjectOutputStream을 객체를 직렬화 해서 스트림을 통해서 저장할 수 있는 writeObject()메소드를 활용함
			oos.writeObject(data);
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			// 순서 중요!
			try {
				if(oos != null) {
					oos.close();
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		
	}

}
