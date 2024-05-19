package SearchingandSorting;

import java.util.Scanner;

public class CodeBinarySearch {
	public static int[] arrayinput()
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int nums[]= new int[n];
		for (int i=0;i<n;i++)
		{
			nums[i]=s.nextInt();
		}
		return nums;
	}
	public static int binarysearch(int nums[],int target)
	{
		int start=0;
		int end=nums.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(target==nums[mid])
			{
				return mid;
			}
			else if(target>nums[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[]=arrayinput();
		Scanner s= new Scanner(System.in);
		int target= s.nextInt();
		int index= binarysearch(nums,target);
		System.out.print(index);
		

	}

}
