import java.util.Scanner;

class ass3_full_py
{
	public static void main(String args[])
	{
		
		for(int i=6;i>=1;i--)
		{
			for( int j = 1 ; j<=i ;j++ )
			{
				System.out.print(" ");
			}
			
			for (int l= i; l<=6 ; l++)
			{
				System.out.print(" *");
			}
			System.out.println();	
		} 
	}
}
