package Oops;

public class Employee {

	int empid;
	String name;
	int salary;
	int deptno;
	
	// for constructor we should define the method with same class name as below
	/*Employee(int id, String name, int sal, int dno) 
	{
		empid=id;
		name=name;
		salary=sal;
		deptno=dno;
		
	}*/
	
	// Below is third method using Method
	/*void setdata(int id, String name, int sal, int dno)
	{
		empid=id;
		name=name;
		salary=sal;
		deptno=dno;
	}*/
	
	void display() // this is the normal method and for calling this method we need to define main method as below
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String args[])
	{
		// Assigning class vairables to objects
	Employee e1= new Employee(); //First Employee
	e1.deptno = 100;
	e1.name= "Wahed";
	e1.salary= 1000;
	e1.empid=10;
	e1.display();
		
		System.out.println();
		System.out.println("Second Employee");
	Employee e2= new Employee();
	e2.deptno = 100;
	e2.name= "Abdul";
	e2.salary= 2000;
	e2.empid=11;
	e2.display();
	
		//Second Method using COnsturctor
		//Assigning class variables using constructors
			/*Employee e1= new Employee(10, "Abdul", 2000, 100);
			e1.display();
			
				System.out.println();
				System.out.println("Second Employee");
			
			
			Employee e2= new Employee(11,"Wahed", 3000, 110);
			e2.display();*/
		
		//Third Method
		//Assigning values to class varaibles using Method
		
		/*Employee e1=new Employee();
		e1.setdata(10, "Wahed", 30000, 100);
		e1.display();*/
	}
}
