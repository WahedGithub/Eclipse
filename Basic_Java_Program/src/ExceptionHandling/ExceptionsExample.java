package ExceptionHandling;

public class ExceptionsExample {

	public static void main(String[] args) {
		System.out.println("Started");
		// Thread.sleep(4000); // InterruptedException
		
		int i=10;
		System.out.println(i/0); //ArithmeticException
		
		System.out.println("Stopped");

	}

}
