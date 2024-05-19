package WhileCondition;
import java.util.Scanner;
public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int S= s.nextInt();
		int E= s.nextInt();
		int W= s.nextInt();
		int Celsius;
		while (S<=E) {
			Celsius= (5*(S-32)/9);
			System.out.print(S);
			System.out.print(" ");
			System.out.println(Celsius);
			S=S+W;
		}

	}

}
