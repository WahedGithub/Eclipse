package Pack2;

import Pack1.A;

public class b extends A
{

	public static void main(String[] args) {
		// calling the default variable and methods from package 1
		/*A aobj=new A();
		aobj.i=10; // default modifiers are still not accessible even though we import the package from in the class.
		aobj.m1();*/
		
		b bobj= new b();
		bobj.i=20;
		bobj.m1();
		

	}

}
