package datastructures;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList<String>(); // now it takes only String elements
	 	
		//ArrayList <Object> list = new ArrayList<Object>(); // for various elements either add <Object> or just define the array list
		//ArrayList al= new ArrayList();
		
		//adding elements to array list
		list.add("Abdul");
		list.add("Wahed");
		list.add("Mohammed");
		list.add("Ayesha");
		list.add("Zain");
		list.add("12");
		
		System.out.println(list.size()); // returns number of elements in array list
		
		System.out.println(list.get(3)); // this will just print the element placed on 3rd position.
		
		for(String s: list) // reading elements from array list
		{
			System.out.println(s);
		}

	}

}
