 package StringMethods;

public class StringMethod1 {

	public static void main(String[] args) {
	 String s= "Abdul";
	 
	 System.out.println(s.length());
	 
	 //Concatenation is used for joining two or more methods
	 String s1= " Wahed";
	 System.out.println(s+s1);
	 
	 System.out.println("This is using concat method " + s.concat(s1));
	 System.out.println("Welcome".concat(" To My World!!!"));
	 
	 //Equals this will return boolean values(true/false) depending on the strings
	 // Java is case sensitive 
	 System.out.println(); 
	 System.out.println("Equals Method");
	 String s2= "WAHED";
	 String s3= "Wahed";
	 System.out.println(s2.equals(s3)); //false
	 
	 
	 System.out.println(s2.equalsIgnoreCase(s3)); //true
	 // Contains Method
	 System.out.println();
	 System.out.println("Contains Method");
	 System.out.println(s3.contains("Abd")); //false
	 System.out.println(s3.contains("WAH")); //false  
	 
	 //Substring(starting index, ending index)
	 System.out.println();
	 String s5="YoMamaSexy";
	 System.out.println("Substring Method");
	 System.out.println(s5.substring(0,2)); //starting index starts from 0,1,2,3… and ending index starts from 1,2,3,4…
	 //01234-->Starting index
	 //12345-->Ending Index

	 System.out.println(s5.substring(2,6));
	 System.out.println(s5.substring(6,10));
	 
	 //replace method
	 System.out.println();
	 System.out.println("Replace Method");
	 System.out.println(s5.replace('Y', 'U'));
	 System.out.println(s5.replace("Sexy", "hot"));
	 
	}

}
