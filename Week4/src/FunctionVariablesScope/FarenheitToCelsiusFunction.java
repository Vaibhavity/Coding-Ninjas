package FunctionVariablesScope;
import java.util.Scanner;
public class FarenheitToCelsiusFunction {
	public static void printFahrenheitTable(int start, int end, int step) {
		for (; start<=end;start+=step)
		{
			int celsius= (int)(((start-32)*5)/9);
			System.out.println(start+" "+celsius);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int step=s.nextInt();
		s.close();
		printFahrenheitTable(start,end,step);
		

	}

}
