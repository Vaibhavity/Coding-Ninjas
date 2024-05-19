package ForLoopAssignment;
import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		s.close();
		int n=1;
		for(int i=1;i<=x;) {
			int term=3*n+2;
			if (term%4==0) {
				n++;
			}
			else {
				System.out.print(term+" ");
				i++;
				n++;
			}
		}

	}

}
