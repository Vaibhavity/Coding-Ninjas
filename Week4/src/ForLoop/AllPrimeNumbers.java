package ForLoop;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		for(int i=2;i<=n;i++) 
		{
			boolean prime=true;
			for(int d=2;d<=i-1;d++)
			{
				if(i%d==0) {
					prime=false;
					break;
				}
			}
			if (prime)
			{
			System.out.println(i);
			}
		}
	}
	

}
