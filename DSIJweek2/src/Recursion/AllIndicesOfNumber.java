package Recursion;

public class AllIndicesOfNumber {
	
	//Private Function:
	private static int[] allIndexes(int input[], int x, int startindex, int nextindex) {
		 if (startindex == input.length) {
	            int[] ans = new int[nextindex];
	            System.arraycopy(input, 0, ans, 0, nextindex);
	            return ans;
	        }

	        if (input[startindex] == x) {
	            int[] ans = allIndexes(input, x, startindex + 1, nextindex + 1);
	            ans[nextindex] = startindex;
	            return ans;
	        } else {
	            return allIndexes(input, x, startindex + 1, nextindex);
	        }
		
	}
	
	
	//Public Function:
	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input,x,0,0);
		
	}

	public static void main(String[] args) {
		int input[]= {1,2,3,2,1};
		int ans[]= allIndexes(input,2);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}

	}

}
