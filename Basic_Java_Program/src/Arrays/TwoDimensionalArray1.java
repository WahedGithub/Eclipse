package Arrays;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		
		int a[][]= {{10,20,25}, {30,40,45}, {50,60,65}, {70,75,80}, {85,90,100}};
		
		for (int i[]:a)    // here the rows value will be assigned to i one by one
		{
			for (int j:i)     // here the i values get assigned to j and in next line it gets printed. 
			{
				System.out.print(j+ " ");
		}
			System.out.println();
		}
	}
}
