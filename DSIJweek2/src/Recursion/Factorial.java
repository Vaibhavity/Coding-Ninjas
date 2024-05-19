package Recursion;
import java.util.Scanner;
public class Factorial {
	public static int fac(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int smallerpart= fac(n-1);
		return n*smallerpart;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//scan.close();
		System.out.println("Hey, enter the number you want to find factorial of :)");
		int n= scan.nextInt();
		int ans=fac(n);
		System.out.print(ans);
	}

}
