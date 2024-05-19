package TwoDimensionalArrays;

public class PrintSpiral {
	//Function to print spiral:
	public static void printspiral(int  matrix[][])
	{
		int n=matrix.length;
		int m=matrix[0].length;
		int total=n*m;
		int count=0;
		int upprow=0, lowrow=n-1,uppcol=0,lowcol=m-1;
		while(count<total)
		{
			//left to right.
			for(int i=uppcol;count<total&&i<=lowcol;i++)
			{
				System.out.print(matrix[upprow][i]+" ");
				count++;
			}
			upprow++;
			//top to down.
			for(int j=upprow;count<total&&j<=lowrow;j++)
			{
				System.out.print(matrix[j][lowcol]+" ");
				count++;
			}
			lowcol--;
			//right to left.
			for(int k=lowcol;count<total&&k>=uppcol;k--)
			{
				System.out.print(matrix[lowrow][k]+" ");
				count++;
			}
			lowrow--;
			//down to top.
			for(int l=lowrow;count<total&&l>=upprow;l--)
			{
				System.out.print(matrix[l][uppcol]+" ");
				count++;
			}
			uppcol++;
		}
	}
	//Main:
	public static void main(String[] args) {
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printspiral(matrix);

	}

}
