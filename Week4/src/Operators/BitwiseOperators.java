package Operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(1&2); //And
//		System.out.println(1|2); //Or
//		System.out.println(1^2); //Exclusively Or i.e. high on exclusively one high input which changes for big numbers
//		System.out.println(~1); //Negation
//		System.out.println(8>>1); //Right Shift by 1; The result is generally equal to n/2
//		System.out.println(-8>>1); // padding is done with 0 for +ve numbers whereas with 1 for -ve numbers
//		System.out.println(8<<1); //left shift by 1; The result is generally equal to 2*n which changes for big numbers
//		System.out.println(-8<<1); //the leftmost digit gets dropped
		for(int i = 0; i < 2; i = i + 1) {
		     for(int j = 0; j < 2; j = j + 1) {
		          if (j == 1)
		              break;
		          System.out.print(j +" ");
		      }
		 } 



	}

}
