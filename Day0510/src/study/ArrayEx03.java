package study;

/*
 *  [char] �ڷ��� �迭�� ���ĺ� �빮�ڸ� ä���,
 *  ä���� �迭�� ��ü ��Ҹ� ���
 *  
 *  ��, char �ڷ����� �迭�� �ʱ�ȭ�� �ݺ����� �̿���
 */

public class ArrayEx03 {

	public static void main(String[] args) {
		// ���ĺ� �빮�� ����
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
