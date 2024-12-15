/*
3. Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
   Sample array: [1,2,4,5,6]
   Target value: 6. 
*/

import java.util.Scanner;

class SumElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6};
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("Enter the sum you find in elements");
		int sum = sc.nextInt();
	
		for(int i = 0 ; i < a.length; i++)
		{
			for(int j = i+i; j < a.length; j++)
			{
				if(a[i] + a[j] == sum)
				{
					System.out.print(a[i]+ " + " +a[j]+ " = " +sum+ " \n");
				}
			}
		}
	}
}