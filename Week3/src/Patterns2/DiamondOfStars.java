package Patterns2;

import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		s.close();
		int i=1;
		while (i<=n/2+1)
		{
			int j=1;
			while (j<=n/2-i+1)
			{
				System.out.print(" ");
				j++;
			}
			j=1;
			while (j<=2*i-1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;	
		}
		i=1;
		while(i<=n/2)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n-2*i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
				
		}

	}

}
