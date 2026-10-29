package Programs;

public class ReverseAnumber {
//https://www.youtube.com/watch?v=xf9z_MszHJ0&list=RDCMUC4C20Zelty7V0fuy5uTHdjQ&index=3
	public static void main(String[] args) {
		int n=12345, rem, rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		
		System.out.println(rev);
		
		//Stringbuilder Method or String Buffer 
		
		/*StringBuilder rev1 = new StringBuilder(String.valueOf(n)).reverse();
		System.out.println(rev1);*/
		
		//one more recursion method is possible

	}

}
