package Patterns1;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		int i=1;
		while (i<=n) {
			int j=1;
			int temp=i;
			while(j<=i)
			{
				System.out.print(temp);
				temp--;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
