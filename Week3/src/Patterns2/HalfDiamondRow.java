package Patterns2;

import java.util.Scanner;

public class HalfDiamondRow {

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int i=1;
		System.out.println("*");
		while (i<=n)
		{
			System.out.print("*");
			int k=1;
			int start=1;
			while(k<=i) {
				System.out.print(start);
				start++;
				k++;
			}
			k=1;
			start--;
			while(k<=i-1)
			{
				start--;
				System.out.print(start);
				k++;
			}
			System.out.print("*");
			System.out.println();
			i++;	
		}
		i=1;
		while(i<=(n-1))
		{
			System.out.print("*");
			int k=1;
			int start=1;
			while(k<=n-i)
			{
				System.out.print(start);
				start++;
				k++;
			}
			k=1;
			start--;
			while(k<=n-i-1)
			{
				start--;
				System.out.print(start);
				k++;
			}
			System.out.print("*");
			System.out.println();
			i++;	
		}
		System.out.print("*");

		
	}

}
