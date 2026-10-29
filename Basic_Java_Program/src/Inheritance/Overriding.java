package Inheritance;


// Inheritance with overriding
class Bank{
	
	int getrateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getrateOfInterest()
	{
		return 10;
	}
}
class ICICI extends Bank
{
	int getrateOfInterest()
	{
		return 15;
	}
}
class Axis extends Bank
{
	int getrateOfInterest()
	{
		return 20;
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		SBI sbiobj= new SBI();
		System.out.println(sbiobj.getrateOfInterest()); //10
		
		ICICI iciciobj = new ICICI();
		System.out.println(iciciobj.getrateOfInterest()); //15
		
		Axis axisobj= new Axis();
		System.out.println(axisobj.getrateOfInterest()); // 20

	}

}
