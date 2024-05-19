package Strings;
import java.util.Scanner;
public class TakingStringInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next(); //next takes input till a delimiter i.e. " " or "\t" or "\n"
		String str1=s.nextLine(); //takes input till next line.
		s.close();
		System.out.println(str+" "+str.length());
		System.out.println(str1+" "+str.length());

	}

}
