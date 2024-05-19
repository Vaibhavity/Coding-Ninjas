package Exceptions;

public class Fraction 
{
	int numerator;
	int denomenator;
	public Fraction(int numerator, int denomenator)
	{
		this.numerator= numerator;
		this.denomenator= denomenator;
		Simplify();
	}
	public void setdenomenator (int denomenator) throws ZeroDenomException
	{
		if(denomenator==0)
		{
			throw new ZeroDenomException();
		}
		this.denomenator= denomenator;
	}
	private void Simplify()
	{
		int gcd=1;
		int min=Math.min(this.numerator, this.denomenator);
		for(int i=1;i<=min;i++)
		{
			if(this.numerator%i==0&&this.denomenator%i==0)
			{
				gcd=i;
			}
		}
		this.numerator= this.numerator/gcd;
		this.denomenator= this.denomenator/gcd;		
	}
	public void print()
	{
		System.out.println(numerator+"/"+denomenator);
	}
	public static void main(String[] args) {}
	}


