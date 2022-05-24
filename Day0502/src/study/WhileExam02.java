package study;

/*
 * while ±¸±¸´Ü
 */

public class WhileExam02 {

	public static void main(String[] args) {
		
		int i = 2, j = 1;
		
		while (i<=9) {     
			while (j<=9) {
	        	System.out.print( i +" X "+ j +" = " + (i*j)+" ");
	               j++;      
	            } 
	        j = 1;
	        i++;
	        System.out.println();
	    }
	}
}
