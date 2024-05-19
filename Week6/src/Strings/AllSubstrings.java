package Strings;

import java.util.Scanner;

public class AllSubstrings {
	//Function to print substrings:
	public static void substrings(String str)
	{
		int n=str.length();
		int i=0;
		while(i<n)
		{
			int j=i;
			while(j<n)
			{
				System.out.println(str.substring(i, j+1));
				j++;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str= s.nextLine();
		s.close();
		substrings(str);

	}

}
