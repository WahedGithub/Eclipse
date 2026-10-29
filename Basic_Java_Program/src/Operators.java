
public class Operators 
{
	public static void main(String[] args)
	{
		
		System.out.println("Arithmetic Operators");
		
		int a =10; //a & b are the variables/operands 
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("Relational Operators");
		//Relational Operators returns boolean values
		System.out.println(a<b);//true
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		System.out.println("Logical Operators will return boolean values");
		
		boolean x= true;
		boolean y= false;
		System.out.println(x&&y);// And
		System.out.println(x || y);//OR
		System.out.println(!x);//this will print the opposite of X
		System.out.println(!y);//this will print the opposite of Y
		
		System.out.println("Assignment, Increment & Decrement");
		int c;
		c=a;
		System.out.println(c);
		c=b;
		System.out.println(c);
		
		c=100;
		c++; //c=c+1; // increment operator
		System.out.println(c);
		c--; //decrement operator
		System.out.println(c);
		
		//For adding specific value
		c+=5; // increment by some specific value
		System.out.println(c);
		
		c-=3;
		System.out.println(c);
	
		
		
	}

}
