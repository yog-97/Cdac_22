import java.util.Scanner;

class ass3_17
{
	public static void main(String args[])
	{
		int k = 0;
		
		for(int i=5; i>=1 ; i--)
		{
			
			for( int j=5; j >= i ; j-- )
			{
				k++;
				System.out.print(k+" ");
			}
			System.out.println();
			
		} 
	}
}
