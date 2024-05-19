package Array;

import java.util.Scanner;

public class TripletSum {
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
	//Tripletsum:
		public static int tripletsum(int arr[],int x)
		{
			int count=0;
			for(int i=0;i<arr.length-2;i++)
			{
				for(int j=i+1;j<arr.length-1;j++)
				{
					for(int k=j+1;k<arr.length;k++)
					{
					if (arr[i]+arr[j]+arr[k]==x)
					{
						count++;
					}
					}
				}
			}
			return count;
		}

	public static void main(String[] args) {
		int arr[]= arrayinput();
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int tripletsum= tripletsum(arr,x);
		System.out.print(tripletsum);
		

	}

}
