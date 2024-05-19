package FunctionVariablesScope;
import java.util.Scanner;
public class nCr {

	public static int factorial(int x)
	{
		int fac=1;
		for(int i=1;i<=x;i++)
		{
			fac=fac*i;
		}
		return fac;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int r= s.nextInt();
		s.close();
		int num= factorial(n);
		int denom= factorial(r)*factorial(n-r);
		System.out.print(num/denom);
		
	}

}
