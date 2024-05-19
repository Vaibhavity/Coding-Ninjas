package Array;

import java.util.Scanner;

public class Sort01 {
	//Function to take input:
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
		
		//Function to print array:
		public static void printarray(int array[])
		{
			int size= array.length;
			for(int i=0;i<size;i++)
			{
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}
		//Sort:
//		public static void sort01(int arr[])
//		{
//			for(int i=0;i<arr.length-1;i++)
//			{
//				for(int j=i+1;j<arr.length;j++)
//				{
//					if(arr[i]!=0)
//					{
//					if (arr[j]==0)
//					{
//						int x=arr[i];
//						arr[i]=arr[j];
//						arr[j]=x;
//					}
//					}
//				}
//			}
//		}
		//other way:
		public static void sort01alt(int arr[])
		{
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==0)
				{
					count++;
				}
			}
			for(int i=0;i<count;i++)
			{
				arr[i]=0;
			}
			for(int i=count;i<arr.length;i++)
			{
				arr[i]=1;
			}
			
		}
		

	public static void main(String[] args) {
		int arr[]=arrayinput();
//		sort01(arr);
		sort01alt(arr);
		printarray(arr);

	}

}
