package Arrays;

import java.rmi.AccessException;

public class ArraysExample {

	public static void main(String[] args) {
		
		int a[]= new int [5]; //declaration of array with 5 elements
		a[0]=10;
		a[2]=30;
		a[1]=20;
		a[3]=40;
		a[4]=50;
		
		/*for(int i=0;i<=4;i++)//read elements from an array
		{
			System.out.println(a[i]);
		}*/
		
		//for..each loop
		
		for (int i:a)
		{
			System.out.println(i);
		}
		}

	}
