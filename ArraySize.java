/*
5. Given an array and a number K where K is smaller than the size of the array. 
   Find the K’th smallest element in the given array. Given that all array elements are distinct.
Examples:  
Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7

*/

import java.util.Scanner;

class ArraySize
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {7, 10, 4, 3, 20, 15};

		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		int k = sc.nextInt();
		for(int i = 0 ; i < a.length; i++)
		{
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[j] < a[i])
				{
				int temp = a[i];
				a[i] = a[j];	
				a[j] = temp;
				}
			}
		}
		System.out.println("the " +k+ " element is : " +a[k-1]);
	}
}