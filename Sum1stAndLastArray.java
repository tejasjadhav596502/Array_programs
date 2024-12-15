//Wap enter an array and find the no in array  which is equal to the sum of 1st and last element.

import java.util.Scanner;

class Sum1stAndLastArray
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number of the Elements");
	int ele = sc.nextInt();
	int arr[]= new int [ele];
	System.out.println("Enter the Elements");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int c=0;
		for(int i = 0; i < arr.length; i++)	
		{
			sum = arr[0] + arr.length-1;
			if(sum == arr[i])
			{
				System.out.print(arr[i]);
				c++;
			}
			
		}
		if(c<1)
			System.out.println("Not available in array");
	}
}