package datastructures;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList al= new ArrayList(); // here we can add any type of elements
		
		System.out.println("Number of elements: " + al.size()); // for getting the size of al

		al.add("Welcome");
		al.add(10);
		al.add(10.42);
		al.add('C');
		
		System.out.println("Number of elements: " + al.size()); // for getting the size of al
		System.out.println("Number of elements in ArrayList: " + al); // for printing all elements instead of using for each loop
	
		//inserting elements into array list
		al.add(2, "Training"); // 2 is describes after number of elements not the position
		al.add(4, 1234); // 4 is describes after number of elements not the position
	
	System.out.println("Number of elements: " + al.size());
	System.out.println("Number of elements in ArrayList: " + al);
	
	// Removing elements from array list
	al.remove("Welcome"); // directly specify the element value
	System.out.println("Number of elements in ArrayList: " + al);
	
	al.remove(2); // on giving the index number it will remove the elements from that place.
	System.out.println("Number of elements in ArrayList: " + al);
	}

}
