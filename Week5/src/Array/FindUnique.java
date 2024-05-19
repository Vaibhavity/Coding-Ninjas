package Array;

import java.util.Scanner;

public class FindUnique {
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
	public static int findunique(int arr[])
	{
		int size= arr.length;
	    for(int i=0;i<size;i++)
	    {
	      boolean isunique=true;
	      for(int j=0;j<size;j++)
	      {
	        if(i != j&&arr[i]==arr[j])
	        {
	         isunique=false;
	        }
	      }
	      if(isunique)
	      {
	        return arr[i];
	      }
	    }
	    return -1;
	}
	public static int findduplicate(int arr[])
	{
		int size= arr.length;
	    for(int i=0;i<size;i++)
	    {
	      for(int j=0;j<size;j++)
	      {
	        if(i != j&&arr[i]==arr[j])
	        {
	        	return arr[i];
	        }
	      }
	    }
	    return -1;
	}
	public static void main(String[] args) {
		int array[]=arrayinput();
		int unique= findunique(array);
		int duplicate= findduplicate(array);
		System.out.print(unique);
		System.out.print(duplicate);

	}

}
