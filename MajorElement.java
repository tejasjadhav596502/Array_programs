/*
Q.3 Find the majority element in the array. A majority element in an array A[] of size n is an element 
   that appears more than n/2 times (and hence there is at most one such element). 

Examples : 

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}

*/
class MajorElement
{
	public static void main(String[] args)
	{
	int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
	
	for(int i = 0; i < a.length;i++)
	{
		System.out.print(a[i]+ " ");
	}
	System.out.println();
	int cnt=0;
	for(int i = 0; i < a.length;i++)
	{
		for(int j = i+1 ; j <a.length; j++)
		{
			if(a[i] == a[j])
			{

				cnt++;
				break;
			}
		
		}	
	}
	cnt>=1;
	break;
	}	
}