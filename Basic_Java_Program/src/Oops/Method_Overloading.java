package Oops;

public class Method_Overloading {

	int a;
	int b;
	
	void sum() //First Method
	{
		a= 10;
		b=20;
		System.out.println(a+b);
		
	}
	
	void sum(int x, int y) { //Second Method
		int a =x;
		int b=y;
		System.out.println(a+b);
	}
	
	void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	void sum(int x, double y) {
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		Method_Overloading mo= new Method_Overloading();
		mo.sum();
		mo.sum(101, 200);
		mo.sum(10,30,40);
		mo.sum(10,10.5);
	}

}
