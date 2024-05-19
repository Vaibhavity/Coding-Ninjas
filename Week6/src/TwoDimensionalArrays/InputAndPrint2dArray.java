package TwoDimensionalArrays;
import java.util.Scanner;
public class InputAndPrint2dArray {
	public static void inputandprint2d()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("rows:");
		int row=s.nextInt();
		System.out.println("Colums:");
		int col=s.nextInt();
		int arr2d[][]= new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("input for "+i+"th row and "+j+"th column");
				arr2d[i][j]= s.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		inputandprint2d();
	}

}
