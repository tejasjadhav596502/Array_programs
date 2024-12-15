//2. Write a Java program to check if an array of integers without 0 and -1

import java.util.Scanner;

class IntegersArray
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of The Numbers");
	int size = sc.nextInt();
	int a[] = new int [size];
	System.out.println("Elements is : ");

	for(int i = 0; i < a.length; i++)
	{
		a[i] = sc.nextInt();
	}
	int c1 = 0;
	int c2 = 0;
	for(int i = 0; i < a.length; i++)
	{
		if(a[i] == 0 || a[i] == -1)
		{
		c1++;
		}
	}
		if(c1 > 0)
		{
			System.out.println("0 or -1 Is present in an array ");
		}	
		else 
		{
			System.out.println("Array Of integers Without 0 & -1");
		}	
	}
}
	
