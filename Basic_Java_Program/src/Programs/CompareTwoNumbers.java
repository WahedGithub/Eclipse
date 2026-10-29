package Programs;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		int num1 =20;
		int num2 =20;
		
		if (num1 > num2)
		{
			System.out.println(num1 + " is greater than " + num2);
		}
		if (num1 >= num2)
		{
			System.out.println(num1 + " is equal to " + num2);
		}
		else {
			System.out.println(num2 + " is greater than "+ num1);
		}
	}

}
