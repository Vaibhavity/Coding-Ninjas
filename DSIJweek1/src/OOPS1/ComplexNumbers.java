package OOPS1;

public class ComplexNumbers {
	int real;
	int img;
	public ComplexNumbers(int real, int img)
	{
		this.real=real;
		this.img=img;
	}
	public void print()
	{
		System.out.println(real+" + i"+img);
	}
	public void plus(ComplexNumbers c2)
	{
		this.real=this.real+c2.real;
		this.img=this.img+c2.img;
	}
	public void multiply(ComplexNumbers c2)
	{
		int a= this.real; int b=this.img; int c=c2.real; int d=c2.img;
		this.real= ((a*c)-(b*d));
		this.img= ((a*d)+(b*c));
	}

}
