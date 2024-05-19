package Patterns1;

import java.util.Scanner;

public class CharacterPatterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while (i<=n)
		{
			int j=1;
			char startchar = (char)('A'+i-1);
			while(j<=i)
			{
				System.out.print(startchar);
				startchar= (char)(startchar +1);
				j++;
			}
			System.out.println();
			i++;
		}


	}

}
