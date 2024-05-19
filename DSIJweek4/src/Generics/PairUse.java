package Generics;

public class PairUse {

	public static void main(String[] args) {
		Pair<String,String> p= new Pair<String,String>("vt","vy");
		Pair<Integer,Integer> p_= new Pair<>(14,31);
		Pair<Integer, Character> p__ = new Pair<>(14,'v');
		Integer a=1;
		Integer b=2;
		Integer c=3;
		Pair<Integer,Integer> internalpair= new Pair<>(a,b);
		Pair<Pair<Integer,Integer>,Integer> externalpair= new Pair<> (internalpair, c);
		System.out.println(externalpair.getfirst().getfirst());
		System.out.println(externalpair.getfirst().getsecond());
		System.out.println(externalpair.getsecond());
		
		
		Character frst= p__.getsecond();
		System.out.println(frst);
		//int can't be used since it is a primitive data type, since Integer is a class, we can create an object of it.
		String s= p.getfirst();
		Integer x= p_.getfirst();
		System.out.println(s);
		System.out.println(x);
		

	}

}
