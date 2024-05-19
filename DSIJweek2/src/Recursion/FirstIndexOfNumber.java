package Recursion;

public class FirstIndexOfNumber {
	private static int firstIndex(int input[], int x, int startindex)
	{
		if(startindex==input.length)
		{
			return -1;
		}
		if(input[startindex]==x)
		{
			return startindex;
		}
		 return firstIndex(input,x,startindex+1);
		
	}
	public static int firstIndex(int input[], int x)
	{
		return firstIndex(input,x,0);
	}

	public static void main(String[] args) {
		int input[]= {1,2,3,2,1};
		int x=1;
		System.out.print(firstIndex(input,x));

	}

}
