package gettingstartedwithjava;
import java.util.Scanner;
public class RectangularArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int x1= s.nextInt();
		int y1= s.nextInt();
		int x2= s.nextInt();
		int y2= s.nextInt();
		int ar= (x2-x1)*(y2-y1);
		System.out.print(ar);
		

	}

}
