package Array;
import java.util.Scanner;
public class IntroToArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		s.close();
		//A basic idea of Array:
		
		int n=15;
		int[] arr=new int[n]; //int arr[]=new int[n] is also a valid statement.
		arr[5]=500;
		System.out.println(arr[5]);
		System.out.println(arr[6]); //A default value=0 to each index.
		char[] charray= new char[10]; //default value is null.
		float[] floatray = new float[10]; //default value is 0.0
		boolean[] boolray= new boolean[10]; //default value is false.
		System.out.println(charray[5]);
		System.out.println(floatray[5]);
		System.out.println(boolray[5]);
		
		//User defined array:
		
		int size=s.nextInt();
		int[] array= new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]= s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
