import java.util.Scanner;

class ass3_pyramid_9
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for( int j = 2; j<=i ; j++)
			{
				
				System.out.print(" ");
			}
			
			for( int l = 5; l>=i ; l--)
			{
				
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		for(int a=1;a<=5;a++)
		{
			for( int j = 1; j<=a ; j++)
			{
				
				System.out.print(" ");
			}
			
			for( int l = 4; l>=a ; l--)
			{
				
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}
}

