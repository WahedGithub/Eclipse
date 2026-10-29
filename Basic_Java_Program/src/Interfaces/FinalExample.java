package Interfaces;

final class Test
{
	final int a =10;
	
	final void m1()
	{
		//a=20; // not changeable as its final
		System.out.println(a);
	}

class test123 extends Test
{
	/*void m1() // not valid bcoz m1 is final method
	{
		//a=20; // not changeable as its final
		System.out.println("m1 is overriden");
	}*/
}


public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
}

