package OOPS1;

public class Polynomial 
{
	public int poly[];
	Polynomial ans=new Polynomial();
	public int degree;
	public int coeff;
	public Polynomial(){
		poly= new int[5];
	}
	public void setCoefficient(int degree,int coeff)
	{
		if(degree>=poly.length)
		{
			resize();
		}
		poly[degree]=coeff;
	}
	private void resize()
	{
		int temp[]=poly;
		poly= new int[poly.length*10];
		for(int i=0;i<temp.length;i++)
		{
			poly[i]=temp[i];
		}
	}
	public void print()
	{
		for(int i=0;i<poly.length;i++)
		{
			if(poly[i]!=0)
			{
				System.out.print(poly[i]+"x"+i+" ");
			}
		}
	}
	public Polynomial add(Polynomial p)
	{
		
		for(int i=0;i<poly.length;i++)
		{
			ans.poly[i]=poly[i]+p.poly[i];
		}
		return ans;
	}
	public Polynomial Subtract(Polynomial p) {
		for(int i=0;i<poly.length;i++)
		{
			ans.poly[i]=poly[i]-p.poly[i];
		}
		return ans;
	}

}
