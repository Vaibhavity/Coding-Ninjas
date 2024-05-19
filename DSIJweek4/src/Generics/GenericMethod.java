package Generics;

public class GenericMethod {
	
	public static <TBD extends printInterface> void printArray(TBD x[])
	{
		for(int i=0;i<x.length;i++)
		{
			x[i].print();
//			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer arr1[]= new Integer[10];
		String arr2[]= new String[10];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=i+1;
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]="gen";
		}
//		printArray(arr1);
//		printArray(arr2);
		Student s[]= new Student[10];
		for(int i=0;i<s.length;i++)
		{
			s[i]= new Student(i+1);
		}
		printArray(s);

	}

}
