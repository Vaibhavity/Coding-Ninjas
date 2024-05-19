package Test1;

import java.util.Scanner;

public class YetAnotherPattern {
	public static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=n-i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int i=1;i<=t;i++)
		{
			int n= s.nextInt();
			pattern(n);
		}

	}

}
