/*
Q2.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e.
   the element that occurs more than once and whose index of the first occurrence is the smallest. 
*/

import java.util.Scanner;

class ArrayQ2RepeatingEle
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size");	
	int size = sc.nextInt();
	int a[] = new int[size];

	for(int i = 0; i < a.length; i++)
	{
		a[i] = sc.nextInt();
	}
	int cnt = 0;
	int lock = -1;
	for(int i = 0; i <a.length; i++)
	{
		cnt = 0;
		for(int j = i+1; j<a.length; j++)
		{
			if(a[i] == lock)
			break;
			if(a[i] == a[j])
			{
			cnt++;
			a[j] = lock;
			}
		}
		if(a[i] != lock)
			System.out.print(a[i] + " count " +cnt);
	}
		
	}
}