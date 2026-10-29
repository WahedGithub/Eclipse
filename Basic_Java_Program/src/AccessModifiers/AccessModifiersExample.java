package AccessModifiers;

class A
{
	private int i=10;
	
	private void m1()
	{
		System.out.println(getI());
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}


public class AccessModifiersExample {

	public static void main(String[] args) {
		A aobj= new A();
		aobj.setI(10); //cannot access since it is private
		aobj.m1(); //cannot access since it is private

	}

}
