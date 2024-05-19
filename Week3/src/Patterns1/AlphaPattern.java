package Patterns1;
import java.util.Scanner;
public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while (i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print((char)('A'+i-1));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
