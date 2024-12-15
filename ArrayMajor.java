/*
8. Find the majority element in the array. A majority element in an array A[] of size n is an element  that appears more than n/2 times 
(and hence there is at most one such element). 
Examples : 
Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}

*/

class ArrayMajor
{
	public static void main(String[] args)
	{
	int a[] = {3, 3, 4, 2, 4, 4, 2, 4, 4} ;
	
		for(int i = 0; i < a.length; i++)
		{	
			System.out.print(a[i]+ " ");	
		}
		int cnt = 0;
		for(int i = 0; i < a.length; i++)
		{
			cnt = 1;
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					cnt++;
				}
			}
		
			if(cnt > a.length / 2)
			{
				System.out.println("\n Majority Element is :  " +a[i]);
			}
		}
	}	
}