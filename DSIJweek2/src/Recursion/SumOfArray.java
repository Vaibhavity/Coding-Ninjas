package Recursion;

public class SumOfArray {
	public static int sum(int input[]) {
		int n=input.length;
		if(n==1)
		{
			return input[0];
		}
		int smallerpart[]= new int[n-1];
		for(int i=1,j=0;i<input.length;i++,j++)
		{
			smallerpart[j]=input[i];
		}
		int smallersol= sum(smallerpart);
		return input[0]+smallersol;		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		System.out.print(sum(arr));
	}

}
