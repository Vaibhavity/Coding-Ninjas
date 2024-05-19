package OOPS1;

public class StudentUse {

	public static void main(String[] args) {
		// Here we don't have to use import as both Student and StudentUse are in same package otherwise: import OOPS1.Student;
		Student s1=new Student("Tweety",111,20); //Creates an object in class student.
		Student s2=new Student("Twinkle",112,25);
		Student s3=new Student("Kitty",113,25);
		s1.printstudent();
		s2.printstudent();
		s3.printstudent();
		//System.out.print("Total number of students:"+s1.number_of_students);
		//or
		System.out.println("Total number of students:"+Student.getnumberofstudents());
//		System.out.println(s1);
//		s1.name="Vaibhavi"; //Accessing properties of Student.
//		s1.roll_number= 177; //Accessing properties of Student.
//		System.out.println(s1.name);
//		System.out.println(s1.roll_number);
//		s1.setage(20);
//		System.out.println(s1.getage());
	}

}
