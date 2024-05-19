package Recursion;

import java.util.Scanner;

public class Fibonacci {
	public static int fibo(int n)
	{
		//base case:
		if(n==0||n==1)
		{
			return n;
		}
		//smaller part approach:
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Hey, enter the term of fibonacci you want to find out :)");
		int n= scan.nextInt();
		int ans=fibo(n);
		System.out.print(ans);

	}

}
