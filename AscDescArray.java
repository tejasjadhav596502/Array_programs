/*
11. Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10}
*/

class AscDescArray
{
	public static void main(String[] args)
	{
		int a[] = {9,1,3,5,6,11,22,66,10};
	
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
			int temp = 0;
			for(int i = 0; i < a.length; i++)	
			{
				for(int j = i+1; j < a.length; j++)
				{
					if(a[i] > a[j])
					{	
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}		
				}
	
				System.out.print(a[i]+ " \n");
			}
			System.out.println();
			int t = 0;
			for(int i = 0; i < a.length; i++)	
			{
				for(int j = i+1; j < a.length; j++)
				{
					if(a[i] < a[j])
					{	
						t = a[i];
						a[i] = a[j];
						a[j] = t;
					}		
				}
				System.out.print(a[i]+ " \n" );
			}

		
	}
}