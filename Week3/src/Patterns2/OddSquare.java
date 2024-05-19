package Patterns2;
import java.util.Scanner;
public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		s.close();
		int i=1;
		int maxval= 2*n-1;
		while (i<=n) {
			int j=1;
			int startvar= 2*i-1;
			while (j<=n)
			{
				if(startvar>maxval)
				{
					startvar=1;
				}
				System.out.print(startvar);
				startvar=startvar+2;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
