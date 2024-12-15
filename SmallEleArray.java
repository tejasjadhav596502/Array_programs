/*
Q1.Given an array and a number K where K is smaller than the size of the array. 
   Find the K’th smallest element in the given array. Given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7
*/

import java.util.*;
class SmallEleArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {7, 10, 4, 3, 20, 15};
		
		for(int i = 0; i <arr.length; i++)
		{
			System.out.print(arr[i]+ " \n");
		}
		System.out.println("Enter the no to find K'th Smallest Element");
		int k = sc.nextInt();

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}	
		for(int i = 0; i < arr.length;i++)
		{
			if( i == k-1)
			{
				System.out.println("Smallest Element is : " +arr[i]);
			}
		}
	}
}