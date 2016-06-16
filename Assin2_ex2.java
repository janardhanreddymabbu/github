package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Assin2_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> arrayList = new ArrayList<String>();
	      arrayList.add("pear");
	      arrayList.add("banana");
	      arrayList.add("tangerine");
	      arrayList.add("strawberry");
	      arrayList.add("blackberry");
	      System.out.println("Before Reverse Order: " + arrayList);
	      Collections.reverse(arrayList);
	      System.out.println("After Reverse Order: " + arrayList);
	      
	     
	 
			// iterate via "iterator loop"
			System.out.println("\n==> Iterator Example...");
			Iterator<String> Iterator_array = arrayList.iterator();
			while (Iterator_array.hasNext()) {
				System.out.println(Iterator_array.next());
			}
			
			System.out.println("\n==> Reversee listIterator Example...");
			ListIterator<String> Iterator_array2 = arrayList.listIterator(arrayList.size());
			while (Iterator_array2.hasPrevious()) {
				System.out.println(Iterator_array2.previous());
			}
	 
			System.out.println("\n==> inserting a second banana into the List in-between the tangerine and the strawberry");
			System.out.println("Before inserting : " + arrayList);
			arrayList.add(2, "banana");
			System.out.println("After inserting : " + arrayList);
	}

}
