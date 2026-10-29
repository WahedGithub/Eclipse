package Oops;

public class Employee_Constructor {

	int empid;
	String empname;
	int salary;
	int deptno;
	
	Employee_Constructor(int id, String name, int sal, int dno)
	{
		empid = id;
		empname = name;
		salary= sal;
		deptno= dno;
		
	}
	
	void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Constructor e1= new Employee_Constructor(10, "Wahed", 3000, 100);
				e1.display();
				
				System.out.println();
				System.out.println("Second Employee");
				
		Employee_Constructor e2= new Employee_Constructor(20, "Abdul", 2000, 101);
			e2.display();
	}

}
