package Array;

import java.util.Scanner;

public class SwapAlternate {
	//Input array:
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
	//Swapping Function:
	public static int[] swapalternate(int arr[])
	{
		int size=arr.length;
		int limit;
		if (size%2==0)
		{
			limit=size;
		}
		else
		{
			limit=size-1;
		}
		for(int i=0;i<limit;i+=2)
		{
			int x=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=x;
		}
		return arr;
	}
	//Printing:
	public static void printarray(int array[])
	{
		int size= array.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	//Main:
	public static void main(String[] args) {
		int arr[]=arrayinput();
		int newarr[]= swapalternate(arr);
		printarray(newarr);

	}

}
