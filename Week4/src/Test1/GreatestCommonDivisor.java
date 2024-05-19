package Test1;

import java.util.Scanner;

public class GreatestCommonDivisor 
{
	//main
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		s.close();
		for(int i=1;i<=t;i++)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			gcd(a,b);
		}
	}
	//function for Greatest Common Divisor:
	public static void gcd(int a, int b)
	{
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		System.out.println(a);
		return;
	}
}
