package study;

/*
 * -50���� 1������ ���� ����ϴ� ���α׷�
 * ��, ���ٿ� 5������ ����Ͻð�, �� ���� ���̸� �� �������� ���ÿ�. 
 */



public class WhileExam05 {

	public static void main(String[] args) {

		int i=-50, count=1;
		
		while(i<=1) {
			
			System.out.print((count%5==0)?(i+"\n"):(i+"\t"));
			
			i++;
			count++;
		}
		
	}

}
