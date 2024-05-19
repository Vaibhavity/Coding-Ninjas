package SearchingandSorting;

public class Sorting {
	//Function for selection sort:
	public static void selectionsort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min=arr[i];
			int minindex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					minindex=j;
				}
			}
			if(arr[i]!=min)
			{
				arr[minindex]=arr[i];
				arr[i]=min;
			}
		}
	}
	//Function for Bubble sort:
	public static void Bubblesort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int x=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=x;
				}
				
			}
		}
	}
	//Function for Insertion sort:
	public static void Insertionsort(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int postn= arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>postn)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=postn;	
		}
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
	//sort012:
		public static void sort012(int[] arr){
	        int i=0,count0=0,count1=0;
	    	while(i<arr.length)
	        {
	            if(arr[i]==0)
	            {
	                count0++;
	            }
	            else if(arr[i]==1)
	            {
	                count1++;
	            }
	            i++;
	        }
	        i=0;
	        while(i<count0)
	        {
	            arr[i]=0;
	            i++;
	        }
	        while(i<count0+count1)
	        {
	            arr[i]=1;
	            i++;
	        }
	        while(i<arr.length)
	        {
	            arr[i]=2;
	            i++;
	        }
	    }

	public static void main(String[] args) {
//		int arr[]= {6,5,4,3,2,1};
		int arr[]= {2, 2, 1, 1, 2, 1, 0, 0, 1, 2, 2 };
//		selectionsort(arr);
//		Bubblesort(arr);
//		Insertionsort(arr);
		sort012(arr);
		printarray(arr);

	}
	

}
