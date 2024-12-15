/*
4. Write a Java program to print all the LEADERS in the array.
  Note : An element is leader if it is greater than all the elements to its right side.
*/

class LeaderArray
{
	public static void main(String[] args)
	{
		int a[] = {23,45,32,67,89,34,12,23,10};

		for(int i = 0 ; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n Leader is");
		int cnt = 0;
		for(int i = 0; i < a.length; i++)
		{
			cnt = 0;
			for(int j = i+1; j <a.length; j++)
			{
				if( a[i] < a[j]) 			// 23 > 45 
				{
				cnt++;
				}
			}
			if(cnt == 0)		
			{
			System.out.print(a[i]+ " ");
			}
			
		}
	}
}