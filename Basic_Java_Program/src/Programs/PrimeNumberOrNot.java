package Programs;

//import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		/*Scanner s= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();*/
		int temp=0;
		
		// this is for checking single number as a prime.
		// for checking between a range of number just add one more fore loop
		
		/*for (int i=2; i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}*/
		for (int i=1; i<=100; i++)
		{
			for(int j=2; j<=i-1;j++);
			{
				if(i%j==0) 
				{
					temp=temp+1;
				}
			}
		}
		if(temp==0) {
			System.out.println(i + " is a prime number");
		}
		else {
			System.out.println(i + " is not a prime number");
		}
		}

	}


