package Test1;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		for (int i=1;i<=n;i++)
		{
			int print1=n;
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(print1);
				print1--;
			}
			System.out.print("*");
			int print2=i-1;
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(print2);
				print2--;
			}
			System.out.println();
		}

	}

}
