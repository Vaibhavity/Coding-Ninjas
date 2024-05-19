package ForLoopAssignment;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int result=0;
		for(;n>0;) {
			int d=n%10;
			result=result*10+d;
			n=n/10;		
		}
		System.out.print(result);

	}

}
