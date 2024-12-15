//Q7.Wap enter an array and print the square of the element which is on odd position.

import java.util.Scanner;

class ArrayQ7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();	
		}	
		System.out.println("Square of the element which is on odd position");
		int sqr= 0;
		for(int i = 1; i <arr.length; i= i+2)
		{
			sqr = arr[i-1]*arr[i-1];
			System.out.println(sqr);
		}
	}	
}