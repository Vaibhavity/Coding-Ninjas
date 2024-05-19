package Recursion2;

public class PrintSubsequences {
	public static void PrintSubsequences(String str, String output)
	{
		if(str.length()==0)
		{
			System.out.println(output);
			return;
		}
		PrintSubsequences(str.substring(1),output);
		PrintSubsequences(str.substring(1),str.charAt(0)+output);
		
		}
	
	public static void PrintSubsequences(String str)
	{
		PrintSubsequences(str, "");
	}

	public static void main(String[] args) {
		PrintSubsequences("uvw");

	}

}
