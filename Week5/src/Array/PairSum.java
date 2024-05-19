package Array;

import java.util.Scanner;

public class PairSum {

	//Input:
	public static int[] arrayinput()
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] array= new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		return array;
	}
	//Pairsum:
	public static int pairsum(int arr[],int x)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]+arr[j]==x)
				{
					count++;
				}
			}
		}
		return count;
	}
	//Main:
	public static void main(String[] args) {
		int arr[]= arrayinput();
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int pairsum= pairsum(arr,x);
		System.out.print(pairsum);

	}

}
