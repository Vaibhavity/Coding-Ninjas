package Patterns2;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		s.close();
		int i=1;
		while (i<=n)
		{
			int count=1;
			int j=1;
			int sum=0;
			while (j<=i)
			{
				int k=1;
				System.out.print(j);
				sum=sum+j;
				if(count<=i-1)
				{
					System.out.print("+");
				}
				j++;
				count++;
			}
			System.out.print("=");
			System.out.println(sum);
			i++;
		}

	}

}
