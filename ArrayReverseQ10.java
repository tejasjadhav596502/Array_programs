//Q10.Wap enter an array and print it in reverse order.

import java.util.Scanner;

class ArrayReverseQ10
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the Elements");

		for(int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array in Reverse order : ");
		
		
			for(int i= arr.length-1; i>=0; i--)
			{
				System.out.println(arr[i]);
			}
		
	}
}