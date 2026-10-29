package Conditional_Statements;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		int day=3;
		switch(day)
		{
		case 1: System.out.println("Sunday");break;
		// As soon as the condition is matched break will take us out of the loop.
		//And the last one will be the default as after that there will be nothing.
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Friday");break;
		
		default: System.out.println("Saturday");
		
		}
				
	}

}
