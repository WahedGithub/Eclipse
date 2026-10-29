package Programs;

public class MaximumValueInArray {

	public static void main(String[] args) {
		int a[]= {4,3,5,1,8,2,6};
		int max=a[0]; // here we assigned the a[0] values to max i.e we are starting the for loop from index 1
		for (int i =1; i<a.length; i++)

		{
			if(max < a[i])
			{
				max=a[i];
			}
		}System.out.println("Maximum element is: "+ max);
		
		System.out.println("*******Minimum Element******");
		int min=a[0]; // here we assigned the a[0] values to max i.e we are starting the for loop from index 1
		for (int i =1; i<a.length; i++)

		{
			if(min > a[i])
			{
				min=a[i];
			}
		}System.out.println("Minimum element is: "+ min);
	}

}
