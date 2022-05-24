package study;

/*
 *  [char] 자료형 배열에 알파벳 대문자를 채우고,
 *  채워진 배열에 전체 요소를 출력
 *  
 *  단, char 자료형의 배열에 초기화는 반복문을 이용함
 */

public class ArrayEx03 {

	public static void main(String[] args) {
		// 알파벳 대문자 구성
		// 1.
		/*
		char aa[] = new char[26];
		aa[0] = 'A';
		*/
		
		// 2.
		/*
		char aa[] = {'A', 'B', 'C'};
		*/
		
		char aa[] = new char[26];
		for(int i=0, b=65;i<aa.length;i++,b++) {
			aa[i] = (char)b;
			System.out.print(aa[i]);
		}
		System.out.println();
		
		char[] alpha = new char[26];
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)('A'+i);
			System.out.print(alpha[i]);
		}
		
	}

}
