package Patterns2;
import java.util.Scanner;
public class InvertedNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i+1)
			{
				System.out.print(n-i+1);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
