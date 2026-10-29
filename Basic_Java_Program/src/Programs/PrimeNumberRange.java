package Programs;

public class PrimeNumberRange {

	//https://www.youtube.com/watch?v=wj1QI1tttDc&list=RDCMUC4C20Zelty7V0fuy5uTHdjQ&index=1
	public static void main(String[] args) {
		//int temp=0;
		for (int n=1; n<=100; n++) 
		{
			int temp=0; // define temp value inside the for loop
			for (int i=2; i<=n-1; i++)
			{
				if (n%i==0) 
				{
					temp=temp+1;
				}
			}
			if(temp==0) 
			{
					System.out.println(n);
				
			
			}
			else { // else part is optional
				temp=0;
			}
			}
		}

	}


