package SearchingandSorting;

public class CountSmall {
	// Function that finds the number of elements in array B that are smaller than or equal to that element for every array element.
	 public static int[] countS(int []a, int []b) {
		 int n=a.length;
		 int m=b.length;
		 int i=0,k=0;
		 int c[]=new int[n];
		 while(i<n)
		 {
			 int j=0,count=0;
			 while(j<m)
			 {
				 if(b[j]<=a[i])
				 {
					 count++;
				 }
				 j++;
			 }
			 c[k]=count;
			 k++;
			 i++;
		 }
		 return c;        
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
		int a[] = {2, 3, 0};
		int b[] = {5, 1};
		int c[] = countS(a,b);
		printarray(c);

	}

}
