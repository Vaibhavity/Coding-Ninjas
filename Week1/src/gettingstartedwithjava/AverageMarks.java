package gettingstartedwithjava;
import java.util.Scanner;
public class AverageMarks {
	public static void main(String args[]) {
		Scanner scan= new Scanner(System.in);
		String str= scan.nextLine();
		int m1= scan.nextInt();
		int m2= scan.nextInt();
		int m3= scan.nextInt();
		int avg= (m1+m2+m3)/3;
		//charAt is used as charAt(index) to get the character at a particular index.
		char name= str.charAt(0);
		System.out.println(name);
		System.out.print(avg);
	}
}
