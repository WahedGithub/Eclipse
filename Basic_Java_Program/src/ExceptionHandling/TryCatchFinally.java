package ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		/*1)	Exception Occurs, catch block handles, finally block execute
		2)	Exception Occurred, catch block not handles, finally block execute
		3)	Exception not Occurred, catch block will ignore, finally block execute*/

		try
		{
			//arr[10]=100; // ArrayIndexOutOfBoundException
			arr[4]=100; // this will just ignore the catch block
			
		}
		
		//catch(ArrayIndexOutOfBoundException e)
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("This is finally block");
		}

	}

}
