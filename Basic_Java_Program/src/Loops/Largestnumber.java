package Loops;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int largest=Math.max(num1, Math.max(num2, num3));
		System.out.println("Largest number is: " + largest);
	}

}
