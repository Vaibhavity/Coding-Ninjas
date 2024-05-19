package Array;

public class ArrangeNumbersInArray {
//Function:
	public static void arrange(int[] arr, int n) {
        if (n%2!=0)
        {
            int index=0;
            for(int i=1,j=0;j<=n/2;j++,i+=2)
            {
                arr[j]=i;
                index++;
            }
            for(int i=n-1,j=0;j<n/2;j++,i-=2)
            {
                arr[index]=i;
                index++;
            }
        }
        else
        {
            int index=0;
            for(int i=1,j=0;j<n/2;j++,i+=2)
            {
                arr[j]=i;
                index++;
            }
            for(int i=n,j=0;j<n/2;j++,i-=2)
            {
                arr[index]=i;
                index++;
            }
        }

    }

	public static void main(String[] args) {

	}

}
