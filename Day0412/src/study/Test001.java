package study;

/* 클래스명의 첫 글자는 대문자로.
 * 자바 프로그램을 시작할때 class, main()을 기본으로
 * 
 * main() 메소드 안에 소스코드를 작성하여 클래스 이름과 동일한 파일명으로
 * 저장함
 * 확장자는    ~.java
 *   
 * 
 * 
 * 
 * */



public class Test001 {

	//main() : 메인 메소드
	
	public static void main(String[] args) {
		
		//코딩영역
		System.out.println("프로그램 실행 테스트");
		//print()안에 있는 문자열을 출력해라
		
		int a = 10, b = 20, c = 200;
		
		System.out.println(a + ", " + b);
		System.out.println(b);
		
		System.out.printf("%d, %d\n", a, b);
		
		System.out.println(c + "원");
		

	}

}





