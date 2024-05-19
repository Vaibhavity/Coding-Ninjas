package ForLoopAssignment;

import java.util.Scanner;
import java.lang.Math;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int i=0,result=0;
		for(;n>0;)
		{
			int d= n%10;
			result= (int)(result + d * (Math.pow(2, i)));
			i++;
			n=n/10;
		}
		System.out.print(result);

	}

}
