package stydy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class InputEx04 {

	public static void main(String[] args) throws IOException{

		String name, nai, addr, tel;

//		InputStreamReader  is =  new InputStreamReader(System.in);
//		BufferedReader bb = new BufferedReader(is);
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("이름 : ");
		name = br.readLine();
		
		System.out.print("나이 : ");
		nai = br.readLine();
		
		System.out.print("주소 : ");
		addr = br.readLine();
		
		System.out.print("전번 : ");
		tel = br.readLine();
		
	}

}
