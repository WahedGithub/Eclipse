package Loops;

public class Breakstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =1; i<=10; i++)
		{
			if(i==5)
			{
				continue; //continue will skip the matched number
				//break; //break will exit out of the loop once the defined number is matched 
			}
			System.out.println(i);
		}
		}
	}
