package Programs;

public class StarPattern {

	public static void main(String[] args) {
		for (int i =1; i<=4; i++)
		{
			for(int j =1; j<=i; j++ ) // this is for incremental order
			{
				System.out.print("* "); // here don't use println other wise it will print in new line everytime
				
			}
				System.out.println(); //this is to switch to new line once the loop exits.
		}
		
		
		System.out.println("##########Decremental Order##########");
		for (int i1 =1; i1<=4; i1++)
		{
			for (int j1=4; j1>=i1; j1--)// this is for decremental order
			{
				System.out.print("* ");
				
			}
				System.out.println();
		}
	}

}
