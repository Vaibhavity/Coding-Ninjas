package Generics;

public class Student implements printInterface {
	int rollnum;
	public Student(int rollnum)
	{
		this.rollnum=rollnum;
	}
	public void print()
	{
		System.out.print("Student:"+rollnum+" ");
	}

}
