package ExceptionHandling;

public class HandleuncheckedExceptions {

	public static void main(String[] args) {
		System.out.println("Program is started");
		int a=20;
		try
		{
			System.out.println(a/0); // Arithmetic exception
		}
		//catch (ArithmeticException e)
		catch(Exception e) //this is the generic super/parent class can be used when exception type is not known
		// inside try block can we use multiple 
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		String s= null;
		
		try
		{
			System.out.println(s.length());
			}
		//catch (NullPointerException e)
		catch(Exception e) // this is the generic super class for can be used when exception type is not known
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Program is in progress");
		System.out.println("Program is completed");
	
	}
	

}
