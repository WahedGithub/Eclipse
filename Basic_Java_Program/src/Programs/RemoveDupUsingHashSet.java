package Programs;

import java.util.HashSet;

public class RemoveDupUsingHashSet {

	public static void main(String[] args) {
		int a[]= {1,3,2,3,4,5,3,2,6};
		// This method is used to remove the duplicacy for sorted and unsorted numbers
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]); // hashset will not allow any duplicate elements
		}
		for (int i:hs)
		{
			System.out.print(i+ " ");
		}

	}

}
