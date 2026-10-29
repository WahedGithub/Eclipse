package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= new int[3][2]; // declaration storing elements/values into array
		
		//int a[][]= {{10,20} {30,40}{50,60}} for infinite number of elements
		
		// 3 rows and 2 coloums, a[0-2] are the rows and a[0-1] are coloums
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		//classic for loop
		
		/*for (int i = 0;i<=2;i++) //for incrementing the rows
		{
			for (int j=0;j<=1;j++)
			{
				System.out.print(a[i][j]+ "  "); // println--> ln will print a new line
			}
			System.out.println();
		}*/
		
		//for.. each loop
		
		for (int i[]:a)
		{
			for (int j:i)
			{
				System.out.print(j+ " ");
		}
			System.out.println();

	}

}
}
