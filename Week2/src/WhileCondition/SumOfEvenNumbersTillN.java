package WhileCondition;
import java.util.Scanner;
public class SumOfEvenNumbersTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int n= s.nextInt();
		int i=2;
		int sum=0;
		while (i<=n) {
			sum = sum+i;
			i= i+2;
		}
		System.out.print(sum);
		

	}

}
