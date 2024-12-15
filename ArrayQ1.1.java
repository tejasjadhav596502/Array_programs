//Q1.Wap to input an array and print it. 

import java.util.*;

class ArrayQ1.1
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int a[] = new int(sc.nextInt());
	System.out.println("Enter the " + sc.nextInt() +" Elements");
	for(int i =0; i <a.length; i++)
	{
		System.out.print(a[i]+ " ");
	}
	System.out.println("Your Array IS:");
	for(int i=0; i <a.length; i++)
	{
		System.out.println(a[i]);
	}
	}
}