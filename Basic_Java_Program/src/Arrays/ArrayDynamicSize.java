package Arrays;

public class ArrayDynamicSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= new int[5]; // this is a static method or Single Dimensional Array
		
		// The below one is the two dimensional Array or Dynamic array
		
		int a[] = {1,2,3,4,5,6}; // Infinite number of elements
		//with the curly braces we can add any number of elements which is dynamic 
		int sum=0;
		for (int i:a)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Sum of all elements are " + sum);
		}

	}

