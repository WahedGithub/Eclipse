package Oops;

public class ConstructorOverloading {

	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverloading()
	{
		a=10;
		b=20;
		c=20.5;
	}
	
	ConstructorOverloading(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	ConstructorOverloading(int a, double b)
	{
		this.a=a;
		this.c=b;
	}
	ConstructorOverloading(int a, int b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		//ConstructorOverloading co= new ConstructorOverloading(); // call first constructor
		//ConstructorOverloading co= new ConstructorOverloading(10,20); // Second Cons
		//ConstructorOverloading co= new ConstructorOverloading(10,21.3); // Third Cons
		ConstructorOverloading co= new ConstructorOverloading(11,21,31.7); // fourth Cons
		co.display();
		
		

	}

}
