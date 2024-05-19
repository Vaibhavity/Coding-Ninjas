package Array;
import java.util.Scanner;
public class ArrayFunction {
	
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
	
	//Function to find largest of an array:
	public static int largestofarray(int array[]) {
		int max=Integer.MIN_VALUE;
		int size= array.length;
		for(int i=0;i<size;i++)
		{
			if(array[i]>max)
			{
				max= array[i];
			}
		}
		return max;
		
	}
	


	public static void main(String[] args) {
		int array[]=arrayinput();
		printarray(array);
		int largest= largestofarray(array);
		System.out.print(largest);
		
	}

}
