package IfElse;
import java.util.Scanner;
public class FindCharacterCase {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String str= s.nextLine();
		char ch= str.charAt(0);
		if(ch>='a'&&ch<='z') { System.out.print(0);}
		else if(ch>='A'&&ch<='Z') { System.out.print(1);}
		else {System.out.print(-1);}
	}
	

}
