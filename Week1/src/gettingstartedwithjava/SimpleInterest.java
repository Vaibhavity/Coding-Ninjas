package gettingstartedwithjava;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int p= s.nextInt();
		float r= s.nextFloat();
		int t= s.nextInt();
		int si= (int)(p*r*t/100);
		System.out.print(si);
		

	}

}
