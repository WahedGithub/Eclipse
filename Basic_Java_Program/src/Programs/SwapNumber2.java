package Programs;

public class SwapNumber2 {

	public static void main(String[] args) {
		int a =10, b=20;
		
		// this is without using the third variable value.
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

}
