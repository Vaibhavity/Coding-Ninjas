package Patterns2;
import java.util.Scanner;
public class StarPattern {

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
			int star1=1;
			while(star1<=i)
			{
				System.out.print("*");
				star1++;
			}
			int star2=1;
			while(star2<=i-1)
			{
				System.out.print("*");
				star2++;
			}
			
			System.out.println();
			i++;
		}
		

	}

}
