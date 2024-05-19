package SearchingandSorting;

public class FindPairWithSmallestDifference {
	//Function to search pair with smallest difference
	 public static int smallestDifferencePair(int []arr1, int []arr2) {
	        int n=arr1.length;
	        int m=arr2.length;
	        int i=0;
	        int min=Integer.MAX_VALUE;
	        int diff1,diff2;
	        while(i<n)
	        {
	        	int j=0;
	        	while(j<arr2.length)
	        	{
	        		diff1=arr1[i]-arr2[j];
	        		diff2=arr2[j]-arr1[i];
	        		if(diff1>=0&&diff1<min)
	        		{
	        			min=diff1;
	        		}
	        		else if(diff2>=0&&diff2<min)
	        		{
	        			min=diff2;
	        		}
	        		j++;
	        	}
	        	i++;
	        }
	        return min;
	}

	public static void main(String[] args) {
		int arr1[] = {10, 20, 30};
		int arr2[] = {17, 15};
		int smallestdiff= smallestDifferencePair(arr1,arr2);
		System.out.print(smallestdiff);
		

	}

}
