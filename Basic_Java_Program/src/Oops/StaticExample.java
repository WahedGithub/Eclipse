package Oops;

public class StaticExample {

	int a; // non static
	static int b;
	
	static void m1()
	{
		System.out.println("this is m1- Static mehtod");
	}
	
	void m2()
	{
		System.out.println("this is non m2 - non static method"); 
	}
	
	void m3() // non static methods can access everything (static and non static stuff)
	{
		a= 101; // non static variable
		b= 201; // static variable 
		// StaticExample.b=201; // another way to access as this is in same class
		
		m1();
		m2();
	}
	public static void main(String[] args) 
	{
		//static methods can access static stuff only without creating the object
		b=100;
		System.out.println(b);
		m1();
		
		//a=200; //not accessible , coz its a non static variable.
		//m2(); //not accessible , coz its a non static method.
		
		StaticExample se =new StaticExample();
		se.a=200;
		System.out.println(se.a);
		se.m2();
		se.m3();

	}

}
