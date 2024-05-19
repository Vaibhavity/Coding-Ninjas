package SearchingandSorting;

public class CodeMergeTwoSortedArrays {
	//Function to merge to sorted array:
	public static int[] mergesortedarray(int arr1[], int arr2[])
	{
		int i=0, j=0,k=0;
		int newarr[]= new int[arr1.length+arr2.length];
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				newarr[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				newarr[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length)
		{
			newarr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length)
		{
			newarr[k]=arr2[j];
			j++;
			k++;
		}
		return newarr;
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

	public static void main(String[] args) {
		int arr1[]= {1,3,5,7,7,9};
		int arr2[]= {2,4,6,8,8,10};
		int newarr[]= mergesortedarray(arr1,arr2);
		printarray(newarr);
		

	}

}
