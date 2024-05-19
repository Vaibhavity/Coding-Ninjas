package OOPS2;

public class Bicycle extends Vehicle {
	  String type;
	  public Bicycle()
	  {
		  System.out.println("bicycle's constructor");
	  }
	  public void details()
	  {
		  super.details(); //refers to super or parent class.
		  System.out.println("bicycle color:"+color);
		  System.out.println("bicycle maxspeed:"+getmaxspeed());
		  System.out.println("bicycle type:"+type);
		  
	  }

	

	}

