package methodex;

/*
 *  여러 가지 기능
 *   1. 최대수
 *   2. 사이의 합계
 *   3. 수열
 *   4. 종료
 */

import java.io.*;

public class MethodEx03 {
	
	// 최대값 구하는 메소드 작성
	public static int aaa() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 수 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		if (a > b) {
			return a;
		} else {
			return b;	
		}
	} // end
	
	// 두 수 사이의 합을 구하는 메소드
	public static void bbb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 수 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		// 누적 변수 선언
		int tot = 0;
		if(a > b ) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		
		for(int i = a; i <= b; i++) {
			tot += i;
		}
		
		System.out.println(a+"와 "+b+" 두 수 사이의 합계 : "+tot);
		
	} // end
	
	// 큰 순서대로 나열하는 수열을 구하는 메소드
	public static String ccc(int x, int y, int z) { // fst = x, scd = y, trd = z
		
		if(y >= x && y >= z) {
			//swap 
			int imsi = x;
			x = y;
			y = imsi;
			
		} else if(z >= x && z >= y) {
			int imsi = x;
			x = z;
			z = imsi;
			
		} 
		if(z >= y) {
			int imsi = y;
			y = z;
			z = imsi;
		}
		
		String result = x + " >= " + y + " >= " + z;
		
		return result ;
	}
	

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0;
		
		while(true) {
			System.out.println("입력(1.최대수 2.두 수 사이의 합계 3.수열 4.종료 )");
			x = Integer.parseInt(br.readLine());
			
			if(x==1) { // return 값을 갖는다.
				int k = aaa();
				System.out.println("두 수중 최대값은 "+k+"입니다.");
			} else if(x==2) {
				bbb();
			} else if(x==3) {
				System.out.print("첫 번째 수 입력 : ");
				int fst = Integer.parseInt(br.readLine());
				System.out.print("두 번째 수 입력 : ");
				int scd = Integer.parseInt(br.readLine());
				System.out.print("세 번째 수 입력 : ");
				int trd = Integer.parseInt(br.readLine());
				System.out.println(ccc(fst, scd, trd));
				
			} else if(x==4) {
				break;
			} else { 
				System.out.println("잘못 입력 하셨습니다.");
			}
			System.out.println();
		}
		System.out.println("수고 하셨습니다.");
		
	}
	
}
