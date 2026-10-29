package Programs;
import java.util.Scanner;
public class Fibonacci {

	    public static void main(String[] args) {
	        /*Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number of terms: ");
	        int count = s.nextInt();
	        //s.close();

	        System.out.println("Fibonacci series up to " + count + " terms:");*/

	        // Initialize the first two terms
	        //int num1 = 0, num2 = 1;
	        int a=0,b=1;

	        // Display the first two terms
	        //System.out.print(num1 + " " + num2);
	        System.out.println("The a & b values are " + a + " & " + b);

	        // Generate and display the Fibonacci terms
	        for( int i=1;i<=5;i++)
	        {
	        	int c=a+b;
	        	System.out.print(" "+ c);
	        	a=b;
	        	b=c;
	        	}
	        
	        
	        /*for (int i = 2; i < count; i++) {
	            int nextNum = num1 + num2;
	            System.out.print(" " + nextNum);
	            num1 = num2;
	            num2 = nextNum;*/
	        
	        
	        }
	    }


