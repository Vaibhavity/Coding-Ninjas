package linkedlist;
import java.util.ArrayList;
public class arraylistdemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1= new ArrayList<>();
		System.out.println("size of ArrayList before adding any element:-"+list1.size());
		list1.add(14); //Adds it to the end of ArrayList.
		list1.add(15);
		list1.add(17);
		System.out.println("size of ArrayList after adding three elements:-"+list1.size());
		list1.add(2,16);
		System.out.println("element at index 2:-"+list1.get(2)); //gets an element from the ArrayList.
		
		//printing array list.
		System.out.println("Resulting array list:-");
		for(int i=0;i<list1.size();i++)
		{
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		
		//removing or updating in array list.
		//list1.remove(3);
		list1.set(3, 24);
		System.out.println("Resulting array list:-");
		//Using for each loop:
		for(int element: list1)
		{
			System.out.print(element+" ");
		}

	}

}

