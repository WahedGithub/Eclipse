package Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		/*Object a[]= new Object[5]; // Single Dimensional Array 
		
		//Object class is a predefined class in Java-->which can store different data types.
		 
		 //Any data type can be hold in the Object class
		 
		a[0]= 10;
		a[1]=20.5;
		a[2]="Welcome";
		a[3]='G'; //this is char which needs to be in single quotation
		a[4]= true;*/ // Boolean value--> either true or false.
		
		Object a[]= {300, 10.2, "String", 'C', false}; // Two/Multi dimensional array 
		for (Object i:a)
		{
			System.out.print(i+ ", ");
		}

	}
}


