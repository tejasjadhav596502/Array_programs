import java.util.Scanner;

class Array2
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of an array");
	int size = sc.nextInt();
	int arr[] = new int [size];

		for(int i = 0; i < arr.length; i++)	
		{
			System.out.println("the element of " + i + " is " );
			arr[i] = sc.nextInt();	
		}
		for(int i = 0; i < arr.length; i++)
		{
		System.out.println("arr ["+i+"] = " +arr[i]); 
		}	
	}
}