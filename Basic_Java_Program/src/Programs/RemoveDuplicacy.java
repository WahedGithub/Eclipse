package Programs;

public class RemoveDuplicacy {

	public static void main(String[] args) {
		int a[]= {1,2,2,3,3,4,5};
		
		int temp[]= new int[a.length];
		
		int j=0; // this will refer to temp array
		for (int i =0; i<a.length-1; i++)
		{
			if (a[i] != a[i+1])
					{
						temp[j]= a[i];
						j++;
						
					}
		}
			temp[j]=a[a.length-1]; // this one is to print the last element as the loop will through the exception error
			
		for(int i=0; i<temp.length; i++)
		{
				System.out.print(temp[i]+ " ");
		}
		}

	}


