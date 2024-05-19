package Array;

import java.util.Scanner;

public class ReturnArraySum {
//input array:
	public static int[] arrayinput()
	{
		Scanner s=new Scanner(System.in);
		int size= s.nextInt();
		int[] array= new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		return array;
	}
//to find sum of array:
	public static int sumofarray(int array[])
	{
		int size= array.length;
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+array[i];
		}
		return sum;
	}
	
//main:
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<=t;i++)
		{
			int array[]=arrayinput();
			int sum=sumofarray(array);
			System.out.println(sum);
			
		}

	}

}
