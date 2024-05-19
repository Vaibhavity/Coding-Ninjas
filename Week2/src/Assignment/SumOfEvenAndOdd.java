package Assignment;
import java.util.Scanner;
public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S= new Scanner(System.in);
		int n= S.nextInt();
		int d,i=10,sumeven=0, sumodd=0;
		while (n>0)
		{
			d=n%i;
			n=n/10;
			if(d%2==0) { sumeven= sumeven+d; }
			else
			{ sumodd= sumodd+d; }
			
		}
		System.out.print(sumeven);
		System.out.print(" ");
		System.out.print(sumodd);

	}

}
