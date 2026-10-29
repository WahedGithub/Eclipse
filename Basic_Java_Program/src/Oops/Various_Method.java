package Oops;

public class Various_Method {
	int a;
	int b;
	
	//1. Method takes no parameters.
	//4. A method may not return any value
	/*void sum()
	{
	System.out.println(a+b);	
	}*/
	
	//2. Method takes parameters
	/*void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}*/
	
	//3. A method returns some value
	int sum()
	{
		return(a+b);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Various_Method cal= new Various_Method();
		
		//1. Method takes no parameters.
		/*cal.a=100;
		cal.b=200;
		cal.sum();*/
		
		//2. Method takes parameters.
		/*cal.sum(100, 201);*/
		
		//3. A method returns some value
		cal.a=101;
		cal.b=201;
		int r =cal.sum();
		System.out.println(r);
	}

}
