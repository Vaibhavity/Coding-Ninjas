package OOPS1;

public class Student {
	String name;
	int roll_number;
	private static int number_of_students; //same for every object i.e. not recreated on creation of an object.
	//final members can be declared as soon as you create them or within constructor.
	private final int age; //this property can not be accessed outside the class as it is.
	//Creating a constructor:
	public Student(String name, int roll_number, int age)
	{
		//this keyword is used to access the data member when we have a local variable with same name:
		this.name= name;
		this.roll_number= roll_number;
		this.age =age;
		number_of_students++;
	}
	public static int getnumberofstudents()
	{
		return number_of_students;
	}
	//We can create multiple constructor simultaneously.
	
//	public Student(String stname)
//	{
//		name=stname;
//	}this is constructor not allowed since age is final, and this constructor doesn't contain age.
	
	//Function to print about student:
	public void printstudent()
	{
		System.out.println(name+" : "+roll_number);
	}
	
	//Function to set an age:
//	public void setage(int a)
//	{
//		if(a<=0)
//		{
//			return;
//		}//This way we're limiting the use of our private age, we can have control over our class.
//		age= a;
//	} not allowed to set age later since it is final.
	
	//Function to communicate with private age:
	public int getage() {
		return age;
	}



	}


