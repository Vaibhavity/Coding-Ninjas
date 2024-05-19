package ForLoopAssignment;

import java.util.Scanner;
import java.lang.Math;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long n= s.nextLong();
		s.close();
		long i=0,result=0,pv=1;
		for(;n>0;)
		{
			long d=n%2;
			result=(result + d *pv);
			pv=pv*10;
			n=n/2;
			i++;
			
		}
		System.out.print(result);

	}

}
