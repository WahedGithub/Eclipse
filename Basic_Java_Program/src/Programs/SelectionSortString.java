package Programs;

public class SelectionSortString {

	public static void main(String[] args) {
		String a[] = {"Abdul", "Wahed", "Zain", "Ayesha", "Mohammed", "Faseeh"};
		int min; 
		String temp="";
		for(int i=0; i<a.length; i++)
		{
			min =i;
			for( int j=i+1; j<a.length; j++)
			{
				if(a[j].compareTo(a[min])<0)
				{
					min =j;
				}
			}
			
		temp=a[i]; //This one is for swapping the values
		a[i]=a[min];
		a[min]=temp;
			
		}
		for (int i = 0; i<a.length; i++) 
		{
			System.out.print(a[i]+ " ");
		}
	
	}
}
