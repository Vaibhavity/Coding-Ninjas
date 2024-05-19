package OOPS2;

public class VehicleUse {

	public static void main(String[] args) {
		Bicycle b=new Bicycle();
		b.color="White";
		b.setmaxspeed(10);
		b.type="Cruiser";
//		b.vehicledetails();
//		b.bicyledetails();
		b.details(); //since the object belongs to bicycle, firstly it will check class bicycle then parent class.
		Vehicle v=new Bicycle(); //Polymorphism.
		v.details();
		

	}

}
