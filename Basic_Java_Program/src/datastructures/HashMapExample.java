package datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hm=new HashMap<Integer, String>();
		
		//adding keypairs into  hash map
		hm.put(100, "Abdul");
		hm.put(200, "Wahed");
		hm.put(300, "Mohammed");
		
		//System.out.println(hm); // directly calling the entry sets of hash map
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+ " " +m.getValue());

		}
		hm.remove(300);
		System.out.println(hm);
		
	}

}
