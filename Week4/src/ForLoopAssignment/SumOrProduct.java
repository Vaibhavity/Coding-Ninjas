package ForLoopAssignment;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int C= s.nextInt();
		if (C==1) {
			int sum=0;
			for (int i=1;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.print(sum);
		}
		else if (C==2) {
			int pro=1;
			for (int i=1;i<=n;i++)
			{
				pro=pro*i;
			}
			System.out.print(pro);
			
		}
		else {
			System.out.print(-1);
			
		}

		

	}

}
