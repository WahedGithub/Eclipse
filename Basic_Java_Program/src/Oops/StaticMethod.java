package Oops;

public class StaticMethod {
	static int a=100;
	static{ // this is static block where we dont have any variable or method.
		// static block is used to define the native methods and for intialize the static members(variable, methods etc)
		System.out.println("hello");
	}
	
	public static void main(String[] arg) {
		System.out.println(a);
		System.out.println("I am inside the main method");
	
	}
}