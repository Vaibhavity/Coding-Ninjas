package OOPS2;

public class Vehicle {
	String color;
	private int maxspeed; //can not be accessed even through the class that inherits vehicle;
	 public Vehicle()
	  {
		  System.out.println("Vehicle's constructor");
	  }
	public void setmaxspeed(int maxspeed)
	{
		this.maxspeed=maxspeed;
	}
	public int getmaxspeed()
	{
		return maxspeed;
	}
	public void details()
	{
		System.out.println("vehicle color:"+color);
		System.out.println("vehicle maxspeed:"+maxspeed);
	}

}
