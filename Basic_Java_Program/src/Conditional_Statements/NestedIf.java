package Conditional_Statements;
import java.io.*;
public class NestedIf {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bfn = new BufferedReader(
	           new InputStreamReader(System.in));
		
		 int i = Integer.parseInt(bfn.readLine()); //for taking the input from user.
		 
		 if (i==1) {
		 System.out.println("Monday");
		 }
		 else if(i ==3){
			 System.out.println("Tuesday");
			 }
		 else if(i==5){
				 System.out.println("Friday");
		 }
		 else {
			 System.out.println("Sunday");
		 }
	}
	

}
