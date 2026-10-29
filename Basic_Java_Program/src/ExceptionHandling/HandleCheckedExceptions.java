package ExceptionHandling;

public class HandleCheckedExceptions {

	public static void main(String[] args) throws Exception {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // we can use this one as well which is part of catch and will not print anything on the screen.
			//System.out.println(e.getMessage());
	}*/
		Thread.sleep(3000);
		
		
		System.out.println("Program is completed"); 
		System.out.println("Program is exited");

	}

}
