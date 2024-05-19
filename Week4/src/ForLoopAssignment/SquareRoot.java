package ForLoopAssignment;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int sqrt=-1,i=1;
		for(;n>=0;)
		{
			n=n-i;
			sqrt++;
			i=i+2;
		}
		System.out.print(sqrt);		

	}

}
