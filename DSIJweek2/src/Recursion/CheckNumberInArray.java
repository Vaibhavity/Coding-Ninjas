package Recursion;

public class CheckNumberInArray {
	public static boolean checkNumber(int input[], int x) {
		int n=input.length;
		if(n==0)
		{
			return false;
		}
		int smallerpart[]= new int[n-1];
		for(int i=1,j=0;i<input.length;i++,j++)
		{
			smallerpart[j]=input[i];
		}
		if(input[0]==x)
		{
			return true;
		}
		else{
			return checkNumber(smallerpart,x);
		}
	}
	public static void main(String args[]) {
		int arr[]= {2,6,1,4,2,3};
		int x=6;
		System.out.print(checkNumber(arr,x));
	}

}
