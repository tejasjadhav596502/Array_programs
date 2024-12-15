/*
9. Given an array of N integers, and a number sum, the task is to find the number of pairs of integers in the array whose sum is equal to sum.
Examples:  
Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2
*/

class ArraySum
{
	public static void main(String[] args)
	{
		int a[] = {1, 5, 7, -1, 4, 2};
		int sum = 6;

		for(int i = 0; i <a.length; i++)
		{
			System.out.print(a[i]+ " ");				
		}
		System.out.println();
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1 ; j < a.length; j++)
			{
				if(a[i] + a[j] == sum)
				{
					System.out.print(a[i]+ " + " +a[j]+ " = " +sum+ " \n");
				}
			}
		}
	}
}
