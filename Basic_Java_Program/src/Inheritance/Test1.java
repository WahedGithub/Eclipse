package Inheritance;

class A
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}

//*********Single level inheritance***************
class B extends A //this get the variables and methods of class A
{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
}

//***********Multi Level Inheritance**********
class C extends B
{
	int q;
	int r;
	
	void addition()
	{
		System.out.println(q+r);
	}
}

public class Test1 {
	
	public static void main(String[] args) {
		B bobj = new B();
		bobj.a= 150; // calling/accessing the class A attributes.
		bobj.x=100;
		bobj.b=120;
		bobj.display();

		C cobj = new C();
		cobj.a= 100;
		cobj.b= 200;
		cobj.x= 300;
		cobj.y=400;
		cobj.q=500;
		cobj.r=600;
		
		cobj.display();
		cobj.show();
		cobj.addition();
	}

}
