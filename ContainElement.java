/*
7. Write a Java program to check if an array of integers contains two specified elements 65 and 77.
*/

import java.util.Scanner;

class ContainElement
{
	public static void main(String[] args)	
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of elements");
	int size = sc.nextInt();
	int a[] = new int [size];

	for(int i = 0; i < a.length; i++)
	{
		a[i] = sc.nextInt();
	}
	int c1=0; 
	for(int i = 0; i < a.length; i++)
	{
		if(a[i] == 65)
		{
		c1++;
		}
		else if(a[i]== 77)
		{
		c1++;
		}
		
	}
		if(c1 == 1 )
		System.out.println("only one element is present");
		else if(c1 == 2)
		System.out.println("Both elements are present");
		else
		System.out.println("65 & 67 both are not present");
	}
}