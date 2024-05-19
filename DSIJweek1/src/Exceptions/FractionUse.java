package Exceptions;

public class FractionUse {
	
	public static void main(String[] args) throws ZeroDenomException {
		// TODO Auto-generated method stub
		Fraction f1= new Fraction(10,10);
		f1.print();
		f1.setdenomenator(0);
		try {
			f1.setdenomenator(0);
		}catch(ZeroDenomException e) {
			System.out.print("0 denomenator is not allowed !");
		}
		

	}

}
