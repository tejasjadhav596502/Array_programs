//1. Write a java program to find prime number between (within) an array of element

import java.util.Scanner;

class Prime
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
		a[i] =sc.nextInt();
	}

	System.out.println(" prime no is ");
	int cnt = 0;
	for(int i = 0; i < a.length; i++)
	{
		cnt = 0;
		for(int j = 1; j <=a[i]; j++)
		{
			if(a[i] % j == 0)
			{
				cnt++;
			}
		}
		if(cnt == 2)
		{
			System.out.print(a[i]+ " ");
		}
	}
	}
}