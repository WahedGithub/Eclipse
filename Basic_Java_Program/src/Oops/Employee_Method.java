package Oops;

public class Employee_Method {

		int empid;
		String empname;
		int salary;
		int deptno;
		
		void setdata(int id, String name, int sal, int dno) {
			empid= id;
			empname= name;
			salary= sal;
			deptno=dno;
		}
		void display() {
			System.out.println(empid);
			System.out.println(empname);
			System.out.println(salary);
			System.out.println(deptno);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Method e1 = new Employee_Method();
		e1.setdata(10, "Wahed", 1000, 100);
		e1.display();
		
		System.out.println();
		System.out.println("Second Employee");
		
		Employee_Method e2= new Employee_Method();
		e2.setdata(21, "Abdul", 1201, 190);
		e2.display();
	}

}
