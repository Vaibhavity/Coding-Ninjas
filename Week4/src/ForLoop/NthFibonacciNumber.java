package ForLoop;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i, start=0, next=1, fibo=0;
		for (i=0;i<=n;i++)
		{
			fibo=fibo+start;
			start=next;
			next=fibo;
		}
		System.out.println(fibo);

	}

}
