package Strings;

import java.util.Scanner;

public class CountWords {
	//Function to count words:
	public static int countwords(String str)
	{
		int i=0,count=1;
		while(i<str.length())
		{
			if(str.charAt(i)==' ')
				
			{
				count++;
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str= s.nextLine();
		s.close();
		int words= countwords(str);
		System.out.print(words);
		

	}

}
