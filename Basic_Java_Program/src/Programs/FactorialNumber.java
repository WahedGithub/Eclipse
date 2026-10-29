package Programs;

public class FactorialNumber {

	public static void main(String[] args) {
		int n=4; 
		int fact=1;
		for (int i=1; i<=n; i++) //increment method
		//for (int i=n; i>=1; i--) // decrement method
		{
			fact =fact*i;
		}
		System.out.println(fact);

	}

}
