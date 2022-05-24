package study;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		for(String s : args) {
			System.out.printf("%3s", s);
		}
		System.out.println();
		
		String[] subjects = {"국어점수", "영어점수", "수학점수"};
		
		for(String ss: subjects) {
			System.out.printf("%3s\n", ss);
		}
		
		System.out.println();
		char ch[] = new char[4];
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		char cha[] = {'j', 'a', 'v', 'a'}; 
		
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch["+i+"]: "+ch[i]);
		}
		for(int i=0;i<cha.length;i++) {
			System.out.println("cha["+i+"]: "+cha[i]);
		}
		
	}

}
