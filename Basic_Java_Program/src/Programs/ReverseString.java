package Programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		/*Scanner s= new Scanner(System.in);
		System.out.println("Enter the name: ");
		String n= s.next();*/
		String n="Abdul";
		int leng= n.length();
		String rev="";
		for(int i=leng-1; i>=0; i--) 
		{
			rev= rev+n.charAt(i);
		}
		System.out.println(rev);
	}

}
