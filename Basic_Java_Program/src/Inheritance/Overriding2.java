package Inheritance;

class vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}
class Bike
{
	void run()
	{
		System.out.println("Bike is running");
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		Bike b= new Bike();
		b.run();
		
		vehicle v= new vehicle();
		v.run();
	}

}
