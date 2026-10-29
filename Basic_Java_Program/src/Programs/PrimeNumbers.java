package Programs;

import java.util.Scanner;

//Its a Even numbers program
public class PrimeNumbers {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter limit: ");
	int value= sc.nextInt();
	System.out.println("Print Even numbers between 1 and the " + value);
	for (int i =1; i<=value; i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}

	}

}
