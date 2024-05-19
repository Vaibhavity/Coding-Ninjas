package Assignment;
import java.util.Scanner;
public class FindPowerOfANumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int x= s.nextInt();
		int i=1,result=n;
		if (x==0) 
		{ 
			System.out.print(1);
		}
		else
		{
			while(i<=x-1){
			result=result*n;
				i++;
			}
			System.out.print(result);
		}

	}

}
