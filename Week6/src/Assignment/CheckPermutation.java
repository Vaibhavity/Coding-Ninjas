package Assignment;

public class CheckPermutation {
	public static boolean permutation(String str1, String str2)
	{
		int n=str1.length();
		int m=str2.length();
		int charcount[]= new int[128];
		if(n!=m)
		{
			return false;
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				charcount[str1.charAt(i)]++;
				charcount[str2.charAt(i)]--;
			}
		}
		for(int i=0;i<charcount.length;i++)
		{
			if(charcount[i]!=0)
			{
				
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1="abc";
		String str2="cbd";
		System.out.print( permutation(str1,str2));
		

	}

}
