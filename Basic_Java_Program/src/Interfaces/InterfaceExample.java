package Interfaces;
interface Testinter
{
	int a= 10; // be default variables is static and final
	void display(); // abstract method
}


public class InterfaceExample implements Testinter{
	public void display()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		InterfaceExample ie = new InterfaceExample();
		Testinter ie1= new InterfaceExample(); // this is another way to assign the object
		ie.display();
		ie1.display();

	}

}
