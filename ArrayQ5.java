//Q5.WAP to check if an array of integers contains two specified elements. 

import java.util.Scanner;

class ArrayQ5
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of An Array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	
	for(int i = 0; i <arr.length; i++)
	{
		arr[i] = sc.nextInt();
	}
		System.out.println("Enter the no,s to cheak It is in array or not");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		for(int i = 0; i < arr.length;i++)
		{
		
		if(no1 == arr[i])
		{
			System.out.println(no1+ " Is present");
		
		}
		if(no2==arr[i])
		{
			System.out.println(no2+ " is present");
		}
		else if (no1==arr[i] || no2 == arr[i])
		{
			System.out.println(no1+ " and " +no2+ " both present");
		}
		else
		System.out.println("both not present");
		}
	}
}