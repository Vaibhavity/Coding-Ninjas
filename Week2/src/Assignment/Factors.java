package Assignment;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int i=2;
		int flag=-1;
		while (i<=n-1) {
			if(n%i==0) {
				System.out.print(i);
				System.out.print(" ");
				flag=0;
			}
			i++;
		}
		if (flag==-1) {
			System.out.print(flag);
		}

	}

}
