package Patterns2;

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i=1;
		while (i<=n)
		{
			int space=1;
			while(space<=n-i)
			{
				System.out.print(" ");
				space++;
			}
			int j=1;
			int start=i;
			while(j<=i)
			{
				System.out.print(start);
				j++;
				start++;
			}
			j=1;
			start--;
			while(j<=i-1)
			{
				start--;
				System.out.print(start);
				j++;
			}
			
			System.out.println();
			i++;
		}

	}

}
