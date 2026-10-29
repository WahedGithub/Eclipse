package Programs;

public class RemoveDuplicacy2 {

	public static void main(String[] args) {
		int a[]= {1,2,2,3,3,4,5};
		
		int j=0; // this will refer to new values in array
		for (int i =0; i<a.length-1; i++)
		{
			if (a[i] != a[i+1])
					{
						a[j]= a[i];
						j++;
						
					}
		}
			a[j]=a[a.length-1]; 
// this one is to print the last element as the loop will run until length-1
			
		for(int i=0; i<j+1; i++) 
// For printing in same array have to take j element and j+1 will print until last element which is defined above
		{
				System.out.print(a[i]+" ");
		}
		}

	}


